package ua.lviv.iot.hospitalModel.department_of_surgery;

import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;

public class Neurosurgeon extends Hospital {

    public Neurosurgeon(String name, Integer age, Integer licenseNumber) {
        super(name,"Master", Department.DEPARTMENT_OF_SURGERY, 15_000, age, licenseNumber);

    }

    @Override
    public void howCanYouHelpMe(){
        System.out.println("I help you with your nervous system");

    }

}
