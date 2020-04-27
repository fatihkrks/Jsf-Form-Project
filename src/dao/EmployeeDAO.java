package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {

		public void insert(Employee employee);
		
		public List<Employee> findAllEmployees();
		
		public void removedEmployee(int id);
}
