package ua.lviv.iot.hospitalModel;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor

public class Hospital {
    private final String name;
    private final String degree;
    private final Department department;
    private Integer salary;
    private Integer age;

    @Override
    public String toString() {
        return name
                + ", degree:  " + degree
                + ", department:  " + department
                + ", salary:  " + salary
                + ", age:  " + age;
    }

    public String getHeaders() {
        return "Name, " + "Degree, " + "Department, " + "Salary, " + "Age";
    }

    public String toCSV() {
        return this.name + ", "
                + this.degree + ", "
                + this.age + ", "
                + this.department + ", "
                + this.salary;
    }

}
