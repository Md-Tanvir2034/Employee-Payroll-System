import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList <Employee> employeeList ;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

   public void addEmployee(Employee employee){
        employeeList.add(employee);
   }

    public void removeEmployee(int id){
        Employee employeeToRemove = null ;

        for (Employee employee : employeeList){
            if(employee.getId() == id ){
                employeeToRemove =employee ;
                break ;
            }
        }

        if(employeeToRemove != null ){
            employeeList.remove(employeeToRemove);
           System.out.println("Employee  with ID " + id + " removed successfulyy");
        }
        else {
            System.out.println("Employee with ID " + id + " not found ");
        }
    }

    public void displayAllEmployees(){
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
    
}
