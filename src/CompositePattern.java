
public class CompositePattern {
    Employee emp1 = new Employee() {

        @Override
        public void addEmployee() {

        }

        @Override
        public void removeEmployee() {

        }
    };

    private static void addEmployee(Employee emp) {
        emp.addEmployee();
        emp.subEmployee.forEach(a -> addEmployee(emp));

    }
}
//profe no logre ingresar al metodo AddEmployes pienso que puede ser por no utilizar correctamente la intefaz para acceder al metodo
