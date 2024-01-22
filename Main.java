import java.util.ArrayList;
import java.util.List;

// Спільний інтерфейс для всіх компонентів
interface Department {
    void printDepartmentName();
}

// Листок (лист) - конкретна реалізація компонента (працівник)
class Employee implements Department {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Employee: " + name);
    }
}

// Композит, який може містити листки (працівників) та інші композити (підрозділи)
class SubDepartment implements Department {
    private String name;
    private List<Department> subDepartments = new ArrayList<>();

    public SubDepartment(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        subDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        subDepartments.remove(department);
    }

    @Override
    public void printDepartmentName() {
        System.out.println("SubDepartment: " + name);
        for (Department department : subDepartments) {
            department.printDepartmentName();
        }
    }
}

