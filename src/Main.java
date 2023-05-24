public class Main {


    public static void main (String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Петров Сергей Игнатьевич", 4, 47000);
        employeeBook.addEmployee("Петрова Мария Игнатьевна", 3, 41000);
        employeeBook.addEmployee("Сергеев Сергей Валентинович", 4, 33000);
        employeeBook.addEmployee("Петрова Анна Сергевна", 3, 53000);
        employeeBook.addEmployee("Потров Иван Игнатьевич", 2, 93000);
        employeeBook.addEmployee("Петровская Валерия Игнатьевна", 5, 18000);
        employeeBook.addEmployee("Анкин Сергей Федорович", 1, 83000);
        employeeBook.addEmployee("Петькин Михаил Иванович", 5, 45000);
        employeeBook.addEmployee("Зайкина Светлана Игоревна", 2, 49000);
        employeeBook.addEmployee("Понтов Игорь Михайлович", 1, 40000);
        employeeBook.removeEmployee("Петрова Мария Игнатьевна", 2);
        employeeBook.addEmployee("Зимская Регина Владимировна", 4, 89000);
        employeeBook.changeEmployeeSalary("Понтов Игорь Михайлович", 42000);
        employeeBook.changeEmployeeDepartment("Зайкина Светлана Игоревна", 5);
        employeeBook.printEmployees();
    }
}