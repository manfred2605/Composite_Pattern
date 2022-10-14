public class Accountant extends Employee{
    @Override
    public int getId() { return this.Id; }

    @Override
    public String getName() { return this.name; }

    @Override
    public double getSalary() { return this.salary; }

    @Override
    public void printInformation() {
        System.out.println("Accountant{" +
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
