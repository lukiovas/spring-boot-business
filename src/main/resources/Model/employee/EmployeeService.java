package Model.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    public List <Employee> getAllEmployees() {

        List<Employee> Employees = new ArrayList<>();
        employeeRepository.findAll()
                .forEach(Employees::add);
        return Employees;
    }

    public List<Employee> getEmployees(String id) {

        List <Employee> Employees = new ArrayList<>();
        employeeRepository.findBySearchTermNative(id)
                .forEach(Employees::add);
        return Employees;
    }


    public Optional<Employee> getEmployee(int id) {
        return employeeRepository.findById(id);
    }


    public void createEmployee(@Valid Employee Employee) {
        employeeRepository.save(Employee);
    }

    public void updateEmployee(@Valid Employee Employee, String id) {
        employeeRepository.save(Employee);

    }

    public void deleteEmployee(int id) {

        employeeRepository.deleteById(id);
    }
}
