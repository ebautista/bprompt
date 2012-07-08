package ph.com.bprompt.datasource.admin.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import ph.com.bprompt.datasource.admin.dao.DepartmentSearchDao;
import ph.com.bprompt.datasource.admin.model.Department;
import ph.com.bprompt.datasource.common.dao.impl.GenericDaoImpl;

public class DepartmentDaoImpl extends GenericDaoImpl<Department, Long> implements DepartmentSearchDao {
	
	public DepartmentDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory, Department.class);
	}

	@Override
	public List<Department> search() {
		return retrieveList("departments", null, null);
	}
}
