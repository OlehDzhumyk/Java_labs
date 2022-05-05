package ua.lviv.iot.hospitalModel.paramedic;

import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;

public class Paramedic extends Hospital {

    Integer numberOfCleanedRoom;

    public Paramedic(String name, Integer age, Integer numberOfCleanedRoom) {
        super(name, "Bachelor", Department.NONE, 7_000, age);
        this.numberOfCleanedRoom = numberOfCleanedRoom;
    }
    @Override
    public String toCSV() {
        return super.toCSV() + ", " + numberOfCleanedRoom;
    }

    @Override
    public String  getHeaders() {
        return super.getHeaders() + ", numberOfCleanedRoom";
    }

}
