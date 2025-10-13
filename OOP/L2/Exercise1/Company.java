
import java.util.Arrays;

public class Company {
    private String name;
    private String address;
    private int number_employees;
    private Employee[] employees;

    public Company(String name, String address, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.number_employees = employees.length;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfEmployees(int number_employees) {
        this.number_employees = number_employees;
    }
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
}

    public int getNumberOfEmployees() {
        return this.number_employees;
    }

    public void recruit(Employee e)
    {
    	Employee[] newEmployees = new Employee[employees.length + 1];
    	
    	for(int i = 0; i< employees.length;i++) {
    		newEmployees[i] = employees[i];
    	}
    	newEmployees[employees.length] = e;
    	employees = newEmployees;
    	number_employees = employees.length;
    	
    }
    public void sortEmployeesByBalance() {
        for (int i = 0; i < employees.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[j].getAccount().getBalance() < 
                    employees[min_idx].getAccount().getBalance()) {
                    min_idx = j;
                }
            }
            
            Employee temp = employees[i];
            employees[i] = employees[min_idx];
            employees[min_idx] = temp;
        }
    }
    public String toString() {
        String result = "Bank Name: " + name + "; Address: " + address + "; Number of employees: " + number_employees + "\n";
        for (int i = 0; i < employees.length; i++) {
            result += employees[i].toString() + "\n";
        }
        return result;
    }

}
