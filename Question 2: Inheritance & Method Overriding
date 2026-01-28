class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;
    public FullTimeEmployee(double salary) {
        this.monthlySalary = salary;
    }
    @Override
    public double calculateSalary() {
        return monthlySalary; 
    }
}

class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double ratePerHour;
    public PartTimeEmployee(double hours, double rate) {
        this.hoursWorked = hours;
        this.ratePerHour = rate;
    }
    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour; 
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(50000);
        Employee e2 = new PartTimeEmployee(120, 200);
        
        System.out.println("Full-time salary: " + e1.calculateSalary());
        System.out.println("Part-time salary: " + e2.calculateSalary());
    }
}
