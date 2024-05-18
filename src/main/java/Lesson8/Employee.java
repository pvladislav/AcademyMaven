package Lesson8;

public class Employee {
    public String name;
    public String lastName;
    public String position;
    private double salary;
    private long idnp;
    public long phoneNumber;
    public char gender;

    public void writeCode (String programmingLanguage) {
        System.out.println(programmingLanguage);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getIdnp() {
        return idnp;
    }

    public void setIdnp(long idnp) {
        this.idnp = idnp;
    }


   @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", idnp=" + idnp +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                '}';
    }
}
