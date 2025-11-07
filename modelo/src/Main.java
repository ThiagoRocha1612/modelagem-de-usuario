import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class Main {

    public static void main(String[] args){

        printEmployee(createManager());
        printEmployee(createSalesman());

    }

    private static Manager createManager(){
        Manager manager = new Manager();
        manager.setCode("123");
        manager.setName("Carlos");
        manager.setSalary(5000);
        manager.setLogin("CarlosManager");
        manager.setPassword("12345");
        manager.setCommission(1200);
        return manager;
    }

    private static Salesman createSalesman() {
        Salesman salesman = new Salesman();
        salesman.setCode("456");
        salesman.setName("Lucas");
        salesman.setSalary(2800);
        salesman.setPercentPerSold(10);
        salesman.setSoldAmount(1000);
        return salesman;
    }

    private static void printEmployee(Employee employee){

        System.out.println("====== " + employee.getClass().getSimpleName() + " ======");
        System.out.println(employee);
        System.out.println("Full Salary + 500 bonus: " + employee.getfullSalary(500));
        System.out.println("Full Salary: " + employee.getfullSalary());
        System.out.println("==========================\n");
    }


}