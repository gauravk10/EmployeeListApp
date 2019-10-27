package com.nit.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nit.bo.EmployeeBO;


public class EmployeeDAOImpl implements EmployeeDAO {

	private static final String GET_ALL_EMPS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";

	private JdbcTemplate template;

	public EmployeeDAOImpl(JdbcTemplate template) {
		this.template = template;
	}

	public List<EmployeeBO> getAllEmployees() {
		List<EmployeeBO> empList = null;
		empList = template.query(GET_ALL_EMPS, rs -> {
			List<EmployeeBO> empBOList = new ArrayList<>();
			EmployeeBO empBO = null;
			while (rs.next()) {
				empBO = new EmployeeBO();
				empBO.setEmpno(rs.getInt(1));
				empBO.setEname(rs.getString(2));
				empBO.setJob(rs.getString(3));
				empBO.setSal(rs.getFloat(4));
				empBO.setDeptno(rs.getInt(5));
				empBOList.add(empBO);
			}
			return empBOList;
		});
		return empList;
	}

}
