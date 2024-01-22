public class OrganizationExample {
    public static void main(String[] args) {
        // Створення працівників
        Employee employee1 = new Employee("John Doe");
        Employee employee2 = new Employee("Jane Doe");

        // Створення підрозділів та додавання до них працівників
        SubDepartment marketing = new SubDepartment("Marketing");
        marketing.addDepartment(employee1);

        SubDepartment sales = new SubDepartment("Sales");
        sales.addDepartment(employee2);

        // Створення кореневого композиту (головна структура організації)
        SubDepartment headOffice = new SubDepartment("Head Office");
        headOffice.addDepartment(marketing);
        headOffice.addDepartment(sales);

        // Виклик операцій на кореневому композиті
        headOffice.printDepartmentName();
    }
}
