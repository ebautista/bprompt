package ph.com.bprompt.datasource;

import java.util.List;

import ph.com.bprompt.datasource.admin.model.Department;
import ph.com.bprompt.datasource.admin.service.DepartmentService;
import ph.com.bprompt.datasource.common.service.GenericService;
import ph.com.bprompt.datasource.common.utils.ApplicationContextUtils;

public class TestMain {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		GenericService<Department, Long> deptService = (GenericService<Department, Long>) ApplicationContextUtils.getBean("departmentService");
		deptService.create(new Department("Sub 3", "lkdhsdfbdfkdjgbdfgbjfbgkjbg", null));
		
		DepartmentService deptSearchService = (DepartmentService) ApplicationContextUtils.getBean("departmentService");
		List<Department> list = deptSearchService.search();
		
		for (Department department : list) {
			System.out.println(department.getName());
		}
	}

}
