public class Employee {
    // private field's
    private String fio;
    private int department;
    private float salary;
    private static int counter;
    private int id;

    // Getter's


    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    // Setter's


    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Constructor

    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Fio: " + fio + " dept: " + department + " Salary: " + salary;
    }

}
