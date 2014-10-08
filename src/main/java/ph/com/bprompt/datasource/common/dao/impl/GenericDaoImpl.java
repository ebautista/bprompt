package ph.com.bprompt.datasource.common.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import ph.com.bprompt.datasource.common.dao.AbstractDao;
import ph.com.bprompt.datasource.common.dao.GenericDao;

@SuppressWarnings("unchecked")
public class GenericDaoImpl<T, PK extends Serializable> extends AbstractDao implements GenericDao<T, PK> {
	
	private final Class<T> type;
	
	/**
	 * Constructor
	 * 
	 * @param sessionFactory
	 * @param type
	 */
	public GenericDaoImpl(SessionFactory sessionFactory, Class<T> type) {
		super(sessionFactory);
		this.type = type;
	}
	
	
	@Override
	public PK create(T newInstance) {
		return (PK) getSession().save(newInstance);
	}

	@Override
	public T read(PK identifier) {
		return (T) getSession().get(this.type, identifier);
	}

	@Override
	public void update(T transientObject) {
		getSession().update(transientObject);
	}

	@Override
	public void delete(PK identifier) {
		getSession().delete(read(identifier));
	}

}
