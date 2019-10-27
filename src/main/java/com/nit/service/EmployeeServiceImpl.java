package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nit.bo.EmployeeBO;
import com.nit.dao.EmployeeDAO;
import com.nit.dto.EmployeeDTO;

@Service("empService")
public final class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	@Qualifier("empDAO")
	private EmployeeDAO empDao;

	@Override
	public List<EmployeeDTO> fetchAllEmployees() {
		List<EmployeeDTO> empDTOList = new ArrayList<EmployeeDTO>();
		List<EmployeeBO> empBOList = null;
		// use dao to invoke method
		empBOList = empDao.getAllEmployees();
		// copy from list of BO to DTO
		empBOList.forEach(empBO -> {
			EmployeeDTO empDTO = new EmployeeDTO();
			BeanUtils.copyProperties(empBO, empDTO);
			empDTO.setSeqNo(empDTOList.size()+1);
			empDTOList.add(empDTO);
		});
		return empDTOList;
	}

}
