package ph.com.bprompt.datasource.admin.dao.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import ph.com.bprompt.datasource.admin.model.Department;

@ContextConfiguration(locations={"/test-applicationContext.xml", "/datasource-applicationContext.xml"})
public class DepartmentDaoImplTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired(required=true)
	DepartmentDaoImpl departmentDaoImpl;
	
	@Before
	public void setUp() throws Exception {
		setSqlScriptEncoding("UTF-8");
		executeSqlScript("test_datasource.sql", false);
	}
	
	@Test
	public void testInsert() {
		Long pk = departmentDaoImpl.create(new Department("HRD", "Human Resources Department", null));
		assertNotNull(pk);
	}
}
