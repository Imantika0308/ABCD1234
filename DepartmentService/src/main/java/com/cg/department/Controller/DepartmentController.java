package com.cg.department.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.department.Entity.Department;
import com.cg.department.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService deService;
	
	@PostMapping("/")
	public Department addDepartment(@RequestBody Department department)
	{	
		return deService.addDepartment(department);
	}
	@GetMapping("/")
	public List<Department> getAllDepartment()  
	{
		return deService.getDepartments();
	}
}
