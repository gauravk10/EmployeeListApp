package com.nit.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {
	
	private int seqNo;
	private int empno;
	private String ename;
	private String job;
	private float sal;
	private int deptno;

}
