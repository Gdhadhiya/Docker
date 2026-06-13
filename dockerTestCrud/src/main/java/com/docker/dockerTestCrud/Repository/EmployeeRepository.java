package com.docker.dockerTestCrud.Repository;

import com.docker.dockerTestCrud.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
