import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList <Employee> employeeList ;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

   public void addEmployee(Employee employee){
        employeeList.add(employee);
   }

    
}
