package ph.com.bprompt.datasource.common.model;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import ph.com.bprompt.datasource.common.utils.CoreDateUtils;

public class DateExpirableWithId<PK> extends AbstractModel<PK> implements Expirable {

	private static final long serialVersionUID = 2415049682730269557L;
	
	private Date fromDate, untilDate;
	
	/**
	 * Constructs an {@link Expirable} that never expires.
	 */
	public DateExpirableWithId() {
		this(null, null);
	}

	public DateExpirableWithId(Date fromDate, Date untilDate) {
		super();
		if (fromDate != null && untilDate != null) {
			if (CoreDateUtils.isAfter(untilDate, fromDate)) {
				throw new IllegalArgumentException("From Date can never be later than Until Date.");
			}
		}
		
		setFromDate(fromDate);
		setUntilDate(untilDate);
	}
	
	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getUntilDate() {
		return untilDate;
	}

	public void setUntilDate(Date untilDate) {
		this.untilDate = untilDate;
	}

	@Override
	public boolean isActive() {
		return isActive(new Date());
	}

	@Override
	public boolean isExpired() {
		return !isActive();
	}
	
	public boolean isActive(Date date) {
		final boolean afterFrom = (fromDate == null) ? false : 
			CoreDateUtils.isAfter(fromDate, date) || DateUtils.isSameDay(fromDate, date);
		final boolean beforeUntil = (untilDate == null) ? true : 
			CoreDateUtils.isBefore(untilDate, date) || DateUtils.isSameDay(fromDate, date);
		
		return afterFrom && beforeUntil;
	}
}
