package staff;

public class Employee {

    private String name;
    private int salary;
    private int birthyear;
    private int day;
    private int month;

    public Employee(String name, int salary, int birthyear, int day, int month) {
        this.name = name;
        this.day = day;
        this.salary = salary;
        this.birthyear = birthyear;
        this.month = month;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    /**
     * Метод увеличивает заработную плату сотрудников на определенный процент.
     *
     * @param em      - массив сотрудников;
     * @param percent - процент повышения заработной платы сотрудников.
     */

    static void salaryIncrease(Employee[] em, int percent) {

        for (int i = 0; i < em.length; i++) {
            em[i].increaser(percent);
        }
    }

    /**
     * Метод повышения заработной платы.
     *
     * @param percent - процент, на который нужно увеличить заработную плату.
     */
    public void increaser(int percent) {
        this.salary += this.salary * percent / 100;
    }

    /**
     * Метод compare сравнивает дату рождения сотрудника с заданной датой.
     * Чтобы сравнить две даты, нужно преобразовать дату в число, таким образом, чтобы любой дате
     * соответствовало одно единственное число.
     * Из одного числа вычитаем другое. Если разность чисел положительна, то заданная дата больше даты рождения.
     * Если раность чисел отрицательная, то заданная дата меньше даты рождения.
     * Если раность числе рана 0, то даты равны между собой.
     *
     * @param year1  - заданный год;
     * @param month1 - заданный месяц;
     * @param day1   - заданный день.
     * @return - возвращает число.
     */

    public int compare(int year1, int month1, int day1) {
        int val1 = day1 + month1 * 10 + year1 * 100;
        int val = this.day + this.month * 10 + this.birthyear * 100;
        int diff = val1 - val;
        return diff;
    }

    /**
     * Метод формирует информационную строку о сотруднике.
     *
     * @return - возвращает информационную строку о сотруднике
     */
    @Override
    public String toString(){
        return String.format("Name: " + getName() + "; Birthday: " + getBirthyear() + "-" + getMonth() + "-" +
                getDay() + "; Salary: " + getSalary() + ".");
    }
    /**
     * Метод выдает информацию по всем сотрудникам в консоль
     *
     * @param em - массив сотрудников
     */
    public static void printArray(Employee[] em) {
        for (int i = 0; i < em.length; i++) {
            System.out.println(em[i].toString());
        }
        System.out.println();
    }
}
