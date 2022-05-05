package ua.lviv.iot.hospitalModel.departmentOfSurgery;

import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;

public class Neurosurgeon extends Hospital {

    Integer numberOfOperations;

    public Neurosurgeon(String name, Integer age, Integer numberOfOperations) {
        super(name, "Master", Department.DEPARTMENT_OF_SURGERY, 15_000, age);
        this.numberOfOperations = numberOfOperations;
    }
    @Override
    public String toCSV() {
        return super.toCSV() + ", " +  numberOfOperations;
    }
    @Override
    public String  getHeaders() {
        return super.getHeaders() + ",  ";
    }

}
