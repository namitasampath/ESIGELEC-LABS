public class Employee {
    private String name;
    private int age;
    private BankAccount account;

    public Employee(String name, int age, BankAccount account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public BankAccount getAccount() {
        return this.account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public String toString() {
        return "[Name: " + this.name + ", Age: " + this.age + "] " + account;
    }
}
