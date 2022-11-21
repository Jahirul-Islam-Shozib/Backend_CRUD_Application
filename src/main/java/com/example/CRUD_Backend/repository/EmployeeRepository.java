package com.example.CRUD_Backend.repository;

import com.example.CRUD_Backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//@Query(value = "SELECT * FROM employees WHERE first_name=:n",nativeQuery = true)
//    Employee getEmployeeByName(@Param("n") String name);
//}
}
