package com.cg.department.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.department.Entity.Department;
import com.cg.department.Repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository dRepository;
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return dRepository.save(department);
	}
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return dRepository.findAll();
	}
}
