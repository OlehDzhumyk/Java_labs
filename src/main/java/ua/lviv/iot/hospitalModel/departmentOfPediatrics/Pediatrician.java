package ua.lviv.iot.hospitalModel.departmentOfPediatrics;

import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;

public class Pediatrician extends Hospital {

    public Pediatrician(String name, Integer age, Integer licenseNumber) {
        super(name,"Master" , Department.DEPARTMENT_OF_PEDIATRICS,  9_000, age, licenseNumber);

    }

}
