import java.util.List;


public class BankManager extends Employee{

    public BankManager(int id, String name, double salary) {
        Id = id;
        this.name = name;
        this.salary = salary;
    }

    public BankManager() {
    }

    public List<BankManager> subEmployees;

    private
    int Id;
    String name;
    double salary;

    @Override
    public int getId() { return this.Id; }
    @Override
    public String getName() { return this.name; }
    @Override
    public double getSalary() { return salary; }

    @Override
    public void printInformation() {
        System.out.println("BankManager{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}');

    }

    @Override
    public void addEmployee() {

    }

    @Override
    public void removeEmployee() {

    }
}