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
    private final Integer licenseNumber;

    @Override
    public String toString() {
        return name +
                ", degree:  " + degree  +
                ", department:  " + department +
                ", salary:  " + salary +
                ", age:  " + age +
                ", licenseNumber: " + licenseNumber;
    }

    public void howCanYouHelpMe(){
        System.out.println("Somehow...");

    }

}
