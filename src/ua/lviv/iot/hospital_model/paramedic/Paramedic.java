package ua.lviv.iot.hospital_model.paramedic;

import ua.lviv.iot.hospital_model.Hospital;

public class Paramedic extends Hospital {

    public Paramedic(String name) {
        super(name,"None", "Bachelor", 7_000);

    }

    @Override
    public void howCanYouHelpMe(){
        System.out.println("I help doctor with helping you");

    }

}
