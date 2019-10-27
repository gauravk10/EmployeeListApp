package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.dto.EmployeeDTO;
import com.nit.service.EmployeeService;

@Controller
public class GetEmployeeInfoController {

	private final EmployeeService empservice;

	@Autowired
	public GetEmployeeInfoController(EmployeeService empservice) {
		this.empservice = empservice;
	}

	@RequestMapping(value = "info.htm")
	public String search(Map<String, Object> map) {
		List<EmployeeDTO> empDTOList = null;
		// use service object to invoke the method
		empDTOList = empservice.fetchAllEmployees();
		map.put("empList", empDTOList);
		return "result";
	}

}
