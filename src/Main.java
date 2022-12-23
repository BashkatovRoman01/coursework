public class Main {
    private static int[] Employee;

    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иванов Иван Иванович", 1, 25500);
        empl[1] = new Employee("Петров Петр Петрович", 2, 31450);
        empl[2] = new Employee("Сергеев Сергей Сергеевич", 3, 40200);
        empl[3] = new Employee("Романов Роман Романович", 4, 50200);
        empl[4] = new Employee("Александров Александр Александрович", 5, 64200);

        for (Employee e : empl) {
            System.out.println(e);
        }
        // Найти сумму расходов
        int sum = 0;
        for (int number : Employee) {
            sum += number;
        }
        System.out.println(" Сумма расходов в месяц составила " + sum);
        // Найти максимальный и минимальный расход
        int min = Employee[0];
        int max = Employee[0];
        for (int i = 1; i < Employee.length; i++) {
            if (Employee[i] < min) {
                min = Employee[i];
            }
            if (Employee[i] > max) {
                max = Employee[i];
            }
        }
        System.out.println(" Минимальное значение = " + min + "; Максимальное зщанчение = " + max);
        // Найти средний расход
        System.out.println("Средний расход за месяц составил " + sum / Employee.length);
    }
}