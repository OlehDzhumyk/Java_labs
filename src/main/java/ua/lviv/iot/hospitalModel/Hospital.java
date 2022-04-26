package ua.lviv.iot.hospitalModel;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor

public abstract class Hospital {
    private final String name;
    private final String degree;
    private final Department department;
    private Integer salary;
    private Integer age;
    @Override
    public String toString() {
        return name +
                ", degree:  " + degree  +
                ", department:  " + department +
                ", salary:  " + salary +
                ", age:  " + age;
    }

}
