package ph.com.bprompt.datasource.admin.dao;

import java.util.List;

import ph.com.bprompt.datasource.admin.model.Department;

public interface DepartmentSearchDao {
	List<Department> search();
}
