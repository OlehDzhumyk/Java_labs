package ua.lviv.iot.hospitalModel.paramedic;

import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;

public class Paramedic extends Hospital {

    public Paramedic(String name, Integer age, Integer licenseNumber) {
        super(name,"Bachelor", Department.NONE,7_000, age, licenseNumber);

    }

    @Override
    public void howCanYouHelpMe(){
        System.out.println("I help doctor with helping you");

    }

}