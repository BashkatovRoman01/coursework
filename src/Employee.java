public class Employee {
    // private field's
    private String FIO;
    private int department;
    private float Salary;
    private static int Counter;
    private int id;

    // Getter's
    public int getId() {
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
    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иванов Иван Иванович", 1, 25500f);
        empl[1] = new Employee("Петров Петр Петрович", 2, 31450f);
        empl[2] = new Employee("Сергеев Сейргей Сергеевич", 3, 40200f);
        empl[3] = new Employee("Романов Роман Романович", 4, 50200f);
        empl[4] = new Employee("Александров Александр Александрович", 5, 64200f);

        for (Employee e: empl) {
            System.out.println(e);
        }
    }
}
