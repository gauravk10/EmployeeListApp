package com.nit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nit.bo.EmployeeBO;

@Repository("empDAO")
public final class EmployeeDAOImpl1 implements EmployeeDAO {

	private static final String GET_ALL_EMPS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";

	@Autowired
	private  JdbcTemplate template;

//	@Autowired
//	public EmployeeDAOImpl1(JdbcTemplate template) {
//		System.out.println("EmployeeDAOImpl1:constructor");
//		this.template = template;
//	}

	public List<EmployeeBO> getAllEmployees() {
		List<EmployeeBO> empList = null;
		BeanPropertyRowMapper<EmployeeBO> bprm = null;
		bprm = new BeanPropertyRowMapper<EmployeeBO>(EmployeeBO.class);
		empList = template.query(GET_ALL_EMPS, new RowMapperResultSetExtractor<EmployeeBO>(bprm));
		return empList;
	}

}
