package ua.lviv.iot.hospitalModel.departmentOfSurgery;

import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;

public class Neurosurgeon extends Hospital {

    public Neurosurgeon(String name, Integer age) {
        super(name,"Master", Department.DEPARTMENT_OF_SURGERY, 15_000, age);

    }

}
