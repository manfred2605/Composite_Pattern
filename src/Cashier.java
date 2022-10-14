public class Cashier extends Employee{
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public void printInformation() {
        System.out.println("Cashier{" +
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

    private
    int Id;
    String name;
    double salary;
}
