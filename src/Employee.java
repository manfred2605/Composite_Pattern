import java.util.List;

public abstract class Employee {

    public int getId() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public double getSalary() {
        return 0;
    }

    public void printInformation() {

    }

    public abstract void addEmployee();
    public abstract void removeEmployee();


    public Employee getChild(int emp){
        return null;
    }
    public List<Employee> subEmployee;
}