public class EmployeeBook {

    private final Employee[] employees;
    private int size;
    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String name, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(name, department, salary);
        employees[size++] = newEmployee;
    }

    public void removeEmployee(String name, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name) || employees[i].getId() == id) {
                System.out.println(employees[i].getName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }
    public void changeEmployeeSalary(String name, int newSalary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name)) {
                employee.setSalary(newSalary);
            }
        }
    }

    public void changeEmployeeDepartment(String name, int newDepartment) {
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name)) {
                employee.setDepartment(newDepartment);
            }
        }
    }

    public void findEmployeeWithSalaryMoreThan(int amount) {
        for (Employee e : employees) {
            if (e.getSalary() >= amount) {
                System.out.println("id = " + e.getId() + " ФИО: " + e.getName() + " Зарплата: " + e.getSalary() + " рублей.");
            }
        }
    }
    public void findEmployeeWithSalaryLessThan(int amount) {
        for (Employee e : employees) {
            if (e.getSalary() < amount) {
                System.out.println("id = " + e.getId() + " ФИО: " + e.getName() + " Зарплата: " + e.getSalary() + " рублей.");
            }
        }
    }
    public void printEmployeesInDepartment(int department) {
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                System.out.println("id = " + e.getId() + " ФИО: " + e.getName() + " Зарплата: " + e.getSalary() + " рублей.");
            }
        }
    }
    public void increaseSalaryInDepartment(int index, int department) {
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                e.setSalary(e.getSalary() + e.getSalary() * index / 100);
            }
        }
    }
    public double getAverageSalaryInDepartment(int department) {
        int count = 0;
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                count = count + 1;
            }
        }
        return (double) calculateTotalSalaryInDepartment(department) / count;
    }

    public int calculateTotalSalaryInDepartment(int department) {
        int total = 0;
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                total = total + e.getSalary();
            }
        }
        return total;
    }
    public Employee findEmployeeWithMaxSalaryInDepartment(int department) {
        Employee employeeWithMaxSalaryInDepartment = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && (employeeWithMaxSalaryInDepartment == null || employee.getSalary() > employeeWithMaxSalaryInDepartment.getSalary())) {
                employeeWithMaxSalaryInDepartment = employee;
            }
        }
        return employeeWithMaxSalaryInDepartment;
    }
    public Employee findEmployeeWithMinSalaryInDepartment(int department) {
        Employee employeeWithMinSalaryInDepartment = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && (employeeWithMinSalaryInDepartment == null || employee.getSalary() < employeeWithMinSalaryInDepartment.getSalary())) {
                employeeWithMinSalaryInDepartment = employee;
            }
        }
        return employeeWithMinSalaryInDepartment;
    }
    public void increaseSalary(int index) {
        for (Employee e : employees) {
            e.setSalary(e.getSalary() + e.getSalary() * index/100);
        }
    }
    public void printNames() {
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }
    public double getAverageSalary() {
        return (double) calculateTotalSalary() / employees.length;
    }
    public Employee getEmployeeWithMaxSalary () {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
    public Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public int calculateTotalSalary() {
        int total = 0;
        for (Employee e : employees) {
            total = total + e.getSalary();
        }
        return total;
    }


}
