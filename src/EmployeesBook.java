
public class EmployeesBook {
    public Employee[] employees = new Employee[10];

        public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        System.out.println(" Нет свободных мест. ");
    }
        public void removeEmployee (String lastName, String name, String middleName){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && name.equals(employees[i].getName())
                    && lastName.equals(employees[i].getLastName())
                    && middleName.equals(employees[i].getMiddleName())) {
                employees[i] = null;
                return;
            }
        }
        System.out.println(" Работника с такими ФИО нет ");
    }

        public void printAllEmployee () {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
        public double sumSalary () {
        double sum = 0d;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
        public void printSumSalary () {
        System.out.println(sumSalary());
    }
        public int getFirstNotNullSalaryIndex () {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                return i;
            }
        }
        throw new RuntimeException(" Нет ни одного работника ");
    }
        public Employee getEmployeeWithMinSalary () {
        Employee employeeWithMinSalary = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }
        public Employee getEmployeeWithMaxSalary () {
        Employee employeeWithMaxSalary = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;

    }
        public void printAllEmployeeByDepartment (String department){
        for (Employee employee : employees) {
            if (department.equals(employee.getDepartment())) {
                System.out.println(employee);
            }
        }
    }
    }
}

