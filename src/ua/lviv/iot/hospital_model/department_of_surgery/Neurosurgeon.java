package ua.lviv.iot.hospital_model.department_of_surgery;

import ua.lviv.iot.hospital_model.Hospital;

public class Neurosurgeon extends Hospital {

    public Neurosurgeon(String name) {
        super(name,"Master","Department of surgery", 15_000);

    }

    @Override
    public void howCanYouHelpMe(){
        System.out.println("I help you with your nervous system");

    }

}
