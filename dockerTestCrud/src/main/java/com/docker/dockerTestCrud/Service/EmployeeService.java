package com.docker.dockerTestCrud.Service;

import com.docker.dockerTestCrud.Entity.Employee;
import com.docker.dockerTestCrud.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;    }

    //save employee
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    //get employee by id
    public Employee getById(Long id){
        return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found!!"));
    }

    // get all employees
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    //update employee
    public Employee update(Long id, Employee employee) {

        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        existing.setName(employee.getName());
        existing.setDepartment(employee.getDepartment());
        existing.setSalary(employee.getSalary());

        return employeeRepository.save(existing);
    }

    //delete employee
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

}
