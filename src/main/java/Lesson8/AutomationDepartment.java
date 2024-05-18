package Lesson8;

public class AutomationDepartment extends Employee {
    public static void main(String[] args) {
        AutomationDepartment Victor = new AutomationDepartment();
        AutomationDepartment Vlad = new AutomationDepartment();

        Victor.name = "Victor";
        Victor.lastName = "Busuioc";
        Victor.gender = 'M';
        Victor.phoneNumber = 37369126258L;
        Victor.position = "Project Manager";
        Victor.setSalary(88000);
        Victor.setIdnp(20120066772593L);

        System.out.println(Victor);

        Vlad.name = "Vladislav";
        Vlad.lastName = "Petrov";
        Vlad.gender = 'M';
        Vlad.phoneNumber = 37361324345L;
        Vlad.position = "QA Analyst";
        Vlad.setSalary(66000);
        Vlad.setIdnp(201200667734423L);

        System.out.println();
        System.out.println(Vlad);

        if (Vlad.getSalary() < Victor.getSalary()) {
            Victor.setSalary(Victor.getSalary() * 3l);
        }
        System.out.println();
        System.out.println(Victor.getSalary());
        System.out.println(Vlad.getSalary());
    }
}