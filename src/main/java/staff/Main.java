package staff;


public class Main {
    /**
     * В этом методе создаются экземпляры классов Employee и Director.
     * Вызывается метод повышения заработной платы из класса Employee и выдается информация о сотрудниках.
     * Вызывается метод повышения заработной платы из класса Director и выдается информация о сотрудниках.
     * Вызывается метод для сравнения заданной даты с датами рождения сотрудников и выдается информация о сотрудниках.
     *
     * @param args
     */
    public static void main(String[] args) {

        Employee em1 = new Employee("Ivan", 50000, 1973, 04, 05);
        Employee em2 = new Employee("Anna", 40000, 1983, 02, 11);
        Employee em3 = new Director("Sergey", 65000, 1989, 29, 10);
        Director em4 = new Director("Vasiliy Alibabaevich", 75000, 1970, 31, 07);
        Employee[] empl = {em1, em2, em3, em4};
        Employee.salaryIncrease(empl, 10);
        Employee.printArray(empl);
        Director.salaryIncrease(empl, 10);
        Employee.printArray(empl);
        Inputdate.input(empl);
    }
}
