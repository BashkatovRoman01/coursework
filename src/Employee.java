public class Employee {
    // private field's
    private String FIO;
    private int department;
    private float Salary;
    private static int Counter;
    private int id;

    // Getter's
    public int getid() {
        return this.id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.Salary;
    }

    // Setter's
    public void SetFIO(String fio) {
        this.FIO = fio;
    }

    public void SetDepartment(int dept) {
        this.department = dept;
    }

    public void SetSalary(float sal) {
        this.Salary = sal;
    }

    // Constructor
    public Employee(String fio, int dept, float salary) {
        FIO = fio;
        department = dept;
        Salary = salary;
        id = ++Counter;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Fio: " + FIO + " dept: " + department + " Salary: " + Salary;
    }

}
