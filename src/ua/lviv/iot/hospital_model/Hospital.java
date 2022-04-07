package ua.lviv.iot.hospital_model;

public abstract class Hospital {

    private  final String name;
    private final String degree;
    private final String department;
    private int salary;

    public Hospital(String name, String degree, String department,  int salary){
        this.name = name;
        this.degree = degree;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void howCanYouHelpMe(){
        System.out.println("Somehow...");

    }

}
