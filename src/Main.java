public class Main {


    public static void main(String[] args) {
        EmployeesBook employeesBook = new EmployeesBook();
        employeesBook.addEmployee(new Employee(" Сидоров", " Сидор", " Сидорович ", 5, 53900));
        employeesBook.printAllEmployee();
        employeesBook.printSumSalary();
        System.out.println(" Максимальная зарплата у сотрудникака "+ employeesBook.getEmployeeWithMaxSalary());
        System.out.println(" Минимальная зарплата у сотрудникака " + employeesBook.getEmployeeWithMinSalary());
    }
}