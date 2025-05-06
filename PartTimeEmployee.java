public class PartTimeEmployee extends Employee {
    private int hoursWorked ;
    private double hourlyRate ;
    private int workedDays ;

    public PartTimeEmployee(String name , int id , int hoursWorked , double  hourlyRate ,int workedDays){
        super(name , id );
        this.hoursWorked = hoursWorked ;
        this.hourlyRate = hourlyRate ;
        this.workedDays = workedDays ;

    }

    @Override 
    public double calculateSalary(){
        return hoursWorked * hourlyRate * workedDays ;
    }


    
}
