package team.jit.management.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import team.jit.management.entity.Employee;
import team.jit.management.repository.EmployeeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}