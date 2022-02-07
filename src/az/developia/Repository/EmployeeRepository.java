package az.developia.Repository;

import az.developia.Employee;
import az.developia.EmployeeDto;

import java.time.LocalDate;
import java.util.Optional;

public interface EmployeeRepository {
    Employee save(Employee e);

    void updateHireDate(String firstName, String lastName, LocalDate hireDate);

    Optional<EmployeeDto> findById(Long id);
}

