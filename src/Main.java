public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иванов Иван Иванович", 1, 25500f);
        empl[1] = new Employee("Петров Петр Петрович", 2, 31450f);
        empl[2] = new Employee("Сергеев Сергей Сергеевич", 3, 40200f);
        empl[3] = new Employee("Романов Роман Романович", 4, 50200f);
        empl[4] = new Employee("Александров Александр Александрович", 5, 64200f);

        for (Employee e : empl) {
            System.out.println(e);
        }
        // Найти сумму расходов
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println(" Сумма расходов в месяц составила " + sum);
        // Найти максимальный и минимальный расход
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(" Минимальное значение = " + min + "; Максимальное зщанчение = " + max);
        // Найти средний расход
        System.out.println("Средний расход за месяц составил " + sum / array.length);
    }
}