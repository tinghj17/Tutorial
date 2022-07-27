package tutorial1;
import java.util.Collection;

public interface EmployeeService {
    public void addEmployee(Employee employee);
    public Collection<Employee> getEmployees();
    public Employee getEmployee(String id);
    public Employee editEmployee(Employee employee) throws EmployeeException;
    public void deleteEmployee(String id);
    public boolean employeeExist(String id);
}
