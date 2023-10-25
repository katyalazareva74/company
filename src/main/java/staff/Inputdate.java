package staff;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputdate {
    /**
     * Метод позволяет задать дату, с котрой будут сравниваться даты рождения сотрудников
     * и об этом выдается информация.
     *
     * @param empl - массив сотрудников
     */
    public static void input(Employee[] empl) {
        try (Scanner scan = new Scanner(System.in)) {
            int n;
            System.out.println("Введите год: ");
            int year = scan.nextInt();
            System.out.println("Введите месяц: ");
            int month = scan.nextInt();
            System.out.println("Введите день: ");
            int day = scan.nextInt();
            System.out.printf("Дата: %d-%d-%d\n", year, month, day);
            for (int i = 0; i < empl.length; i++) {
                n = empl[i].compare(year, month, day);
                if (n > 0)
                    System.out.println("Заданная дата больше даты рожденя");
                else if (n < 0)
                    System.out.println("Заданная дата меньше даты рожденя");
                else
                    System.out.println("Заданная дата равна дате рожденя");
                System.out.println(empl[i].toString());
            }
        } catch (InputMismatchException e) {
            System.out.println("Неправильный ввод даты!");
        }
    }
}
