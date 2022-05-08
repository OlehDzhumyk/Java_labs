package ua.lviv.iot.hospitalModel.departmentOfPediatrics;

import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;

public class Pediatrician extends Hospital {

    Integer numberOfCuredChildren;

    public Pediatrician(String name, Integer age, Integer numberOfCuredChildren) {
        super(name, "Master", Department.DEPARTMENT_OF_PEDIATRICS,  9_000, age);
        this.numberOfCuredChildren = numberOfCuredChildren;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + numberOfCuredChildren;
    }

    @Override
    public String  getHeaders() {
        return super.getHeaders() + ", numberOfCuredChildren";
    }

}
