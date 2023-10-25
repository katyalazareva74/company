package staff;

public class Director extends Employee {

    public Director(String name, int salary, int birthyear, int day, int month) {
        super(name, salary, birthyear, day, month);
    }

    /**
     * Метод повышения заработной платы сотрудников, кроме руководителя.
     *
     * @param em      - массив сотрудников, в том числе и руководитель.
     * @param percent - процент повышения заработной платы.
     */
    public static void salaryIncrease(Employee[] em, int percent) {
        for (int i = 0; i < em.length; i++) {
            if (!(em[i] instanceof Director))
                em[i].increaser(percent);
        }
    }
}
