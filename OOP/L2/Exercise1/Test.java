import java.util.Random;

public class Test {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("BNP", 0);
        BankAccount acc2 = new BankAccount("BNP", 0);
        BankAccount acc3 = new BankAccount("BNP", 0);
        BankAccount acc4 = new BankAccount("BNP", 0);
        BankAccount acc5 = new BankAccount("BNP", 0);

        Employee[] employees = {
            new Employee("Marie", 23, acc1),
            new Employee("Alfie", 32, acc2),
            new Employee("Anand", 39, acc3),
            new Employee("Lester", 63, acc4),
            new Employee("Nathan", 38, acc5)
        };
        Company cmp1 = new Company("BNP", "St. Sever", employees);
        Random rand = new Random();
        for (int i = 0; i < employees.length; i++) {
            double salary = 1500 + rand.nextDouble() * 500; 
            employees[i].getAccount().credit(salary);
        }


        System.out.println(cmp1);
        
        Employee newEmp = new Employee("Sophie", 27, new BankAccount("BNP", 1800.08765));
        cmp1.recruit(newEmp);
        cmp1.sortEmployeesByBalance();

        System.out.println(cmp1);
        
    }
}
