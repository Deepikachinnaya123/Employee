package com.deepi.EmployeeService.repo;
import com.deepi.EmployeeService.Entity.Employee;
import com.deepi.EmployeeService.Entity.EmployeePKId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeePKId> {
}

