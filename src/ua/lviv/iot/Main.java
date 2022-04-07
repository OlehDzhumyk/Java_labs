package ua.lviv.iot;

import ua.lviv.iot.hospital_model.Hospital;
import ua.lviv.iot.hospital_model.department_of_pediatrics.Pediatrician;
import ua.lviv.iot.hospital_model.department_of_surgery.Neurosurgeon;
import ua.lviv.iot.hospital_model.paramedic.Paramedic;

public class Main {

    public static void main(String[] args) {

        Hospital Oleh = new Neurosurgeon("Oleh");
        Oleh.howCanYouHelpMe();

        Hospital Olena = new Pediatrician("Olena");
        Olena.howCanYouHelpMe();

        Hospital Sergiy = new Paramedic("Sergiy");
        Sergiy.howCanYouHelpMe();

    }


}


