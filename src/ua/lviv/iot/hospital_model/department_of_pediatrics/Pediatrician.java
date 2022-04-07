package ua.lviv.iot.hospital_model.department_of_pediatrics;

import ua.lviv.iot.hospital_model.Hospital;

public class Pediatrician extends Hospital {

    public Pediatrician(String name) {
        super(name,"Master" ,"Department of pediatrics",  9_000 );

    }

    @Override
    public void howCanYouHelpMe(){
        System.out.println("I help you if you are a child");

    }
}
