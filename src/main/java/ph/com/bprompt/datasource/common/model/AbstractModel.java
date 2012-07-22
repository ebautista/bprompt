package ph.com.bprompt.datasource.common.model;

import java.io.Serializable;

import javax.persistence.Id;

public abstract class AbstractModel<PK> implements Serializable {

	private static final long serialVersionUID = 7416300721081024252L;
	
	protected static final String CONST_STRING_SEPARATOR = ", ";
	
	@Id
	private PK id;

	public AbstractModel() {
	}

	public AbstractModel(PK id) {
		this.setId(id);
	}

	public PK getId() {
		return id;
	}

	public void setId(PK id) {
		this.id = id;
	}
}
