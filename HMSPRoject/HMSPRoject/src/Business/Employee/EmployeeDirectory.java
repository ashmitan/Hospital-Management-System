/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class EmployeeDirectory {
    
    
        private ArrayList<Employee> employeeList;
    private int empIdCounter = 1;
    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setFirstName(name);
        //employee.setEmployeeId(empIdCounter++);
        employeeList.add(employee);
        return employee;
    }
           
}
