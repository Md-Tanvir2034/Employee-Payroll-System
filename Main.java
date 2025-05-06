

public class Main{
    public static void main(String[] args ){

        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee e1 = new FullTimeEmployee("Tanvir", 60390, 50000);
        PartTimeEmployee e2 = new PartTimeEmployee("Mahmud", 232596, 10, 250 , 15);

        payrollSystem.addEmployee(e1);
        payrollSystem.addEmployee(e2);
        System.out.println("Employee deatails:");
        payrollSystem.displayAllEmployees();

        System.out.println("Removing employee with ID 60390");
        payrollSystem.removeEmployee(60390);

        System.out.println("Employee details after removal:");
        payrollSystem.displayAllEmployees();

        
    }
}