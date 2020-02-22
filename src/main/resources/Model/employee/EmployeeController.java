package Model.employee;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/Employees")
    public List<Employee> getAllEmployees() {
        return  employeeService.getAllEmployees();
    }

    @RequestMapping("/Employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }
    @RequestMapping("/Employees/search={id}")
    public List<Employee> getEmployees(@PathVariable String id) {
        return employeeService.getEmployees(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/Employees", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addEmployee(@RequestBody Employee Employee) {
        employeeService.createEmployee(Employee);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Employees/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateEmployee(@RequestBody Employee Employee, @PathVariable String id) {
        employeeService.updateEmployee(Employee, id);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/Employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
