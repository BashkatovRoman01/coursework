public class EmployeesBook {
    public static Employee[] employees = new Employee[10];

    {
        public void Employee[] addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        System.out.println(" Нет свободных мест. ");
    }
        public void removeEmployee (String lastName, String name, String middleName){
        for (i = 0; i < employees.length; i++) {
            if (employees[i]!=null && name.equals(employees[i].getName())
            && lastName.equals(employees[i].getLastName())
                    && middleName.equals(employees[i].getMiddleName()) {
                employees [i]=null;
            }
        }
    }
        public void printAllEmployee () {

        }
    }
    }
}