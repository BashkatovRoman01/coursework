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
    }
}