import java.util.Objects;

public class Employee {
    private String lastName;
    private String name;
    private String middleName;
    private int department;
    private double salary;
    private final long id = count;
    private static long count = 1L;

    public Employee(String lastName, String name, String middleName, int department, double salary) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }
    private boolean isDepartment (int department) {
        if (department.equals("1") ||(department.equals("2") || department.equals("3") || department.equals("4") || department.equals("5")); {
            return true;
        }
        return false;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " Работник № " + id + " ,ФИО " + lastName + " " + name + " " + middleName + " работает в оделе " + department + "получает зарплату " + String.format("%2f", salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
