package com.util;

import java.util.Comparator;

import com.employeedao.Employee;

public class EmployeeCustomSort implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		int nameCompare = e1.getName().compareTo(e2.getName());
		int ageCompare = e1.getAge().compareTo(e2.getAge());
		int salaryCompare = e1.getSalary().compareTo(e2.getSalary());
		
		if(nameCompare<0) {
			return -1;
		}else if(nameCompare>0) {
			return 1;
		}else {
			if(ageCompare<0)
				return -1;
			else if(ageCompare>0)
				return 1;
			else {
				if(salaryCompare<0)
					return -1;
				else if(salaryCompare>0)
					return 1;
				else {
					return -1;
				}
			}
		}
	}

}
