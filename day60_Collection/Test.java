package day60_Collection;

class Employee{
    public int salary;
    }


class Manager extends Employee{
    public int budget;

}
class Director extends Manager{
    public int stockOptions;
}


public class Test {
    public static void main(String[] args) {
        Employee employee = new Director();
        Manager manager = new Manager();
        Director director = new Director();

        director.stockOptions = 1_000;
        manager.budget = 1_000_000;
        employee.salary = 50_000;
        director.salary = 80_000;
    }
}
