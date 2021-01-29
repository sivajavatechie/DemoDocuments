package com.sivajavatechie.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * 
 * @author Sivareddy
 * You can run this program on any Java IDE(eclipse, IntelliJ etc..)
 * Create Java project, create package with name com.sivajavatechie.streams
 * and Create a Class name with Java8StreamsPrograms and copy this code and run the program as Java Application
 * If you are looking for an explanation on the below programs, Please refer below youtube link.
 * Youtube URL: https://www.youtube.com/watch?v=1pweZskNq7w
 */

public class Java8StreamsPrograms {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "siva", 101, "active", 2000));
		empList.add(new Employee(102, "reddy", 101, "active", 5000));
		empList.add(new Employee(103, "raju", 102, "inactive", 6000));
		empList.add(new Employee(104, "shivam", 102, "inactive", 4000));
		empList.add(new Employee(105, "bob", 103, "active", 3500));
		empList.add(new Employee(106, "alice", 103, "inactive", 3500));
		empList.add(new Employee(107, "srinu", 104, "active", 3500));
		//1.Write a program to print employee details working in each department
		System.out.println("========== Get Employee details department wise ==========");

		Map<Integer, Set<Employee>> empMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toSet()));
		empMap.entrySet().forEach(t -> {
			System.out.println(t.getKey() + "---->"
					+ t.getValue().stream().map(v -> v.getEmpName()).collect(Collectors.joining(",")));
		});
		
		//2.Write a program to print employees count working in each department
		System.out.println("====== Employees count department wise =============");
		Map<Integer, Long> empCountDeptWise = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
		System.out.println(empCountDeptWise);
	
		//3.Write a program to print active and inactive employees in the given collection
		System.out.println("================ Active and Inactive Employees count ================");
		Long activeEmpCount = empList.stream().filter(t -> "active".equals(t.getStatus())).count();
		Long inactiveEmpCount = empList.stream().filter(t -> "inactive".equals(t.getStatus())).count();
		System.out.println("Active Employees count --> " + activeEmpCount);
		System.out.println("InActive Employees count --> " + inactiveEmpCount);

		//4.Write a program to print Max/Min employee salary from the given collection
		System.out.println("================ Get Max/Min employee salary from the given collection ===========");
		Optional<Employee> e = empList.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println("Max salary employee details -->" + e);
		e = empList.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println("Min salary employee details -->" + e);


		//5.Write a program to print the max salary of an employee from each department
		System.out.println("=========== Max salary of an employee in each department ======");

		Map<Integer, Optional<Employee>> topSalaryEmpDeptWise = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

		topSalaryEmpDeptWise.entrySet().stream().forEach(entry -> {
			System.out.println("dept No -->" + entry.getKey() + " Max Salary emp in the department ----> " + entry.getValue().get());
		});
	}

}

class Employee {

	private int empId;
	private String empName;
	private int deptId;
	private String status = "active";
	private int salary;

	public Employee(int empId, String empName, int deptId, String status, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", status=" + status
				+ ", salary=" + salary + "]";
	}

}