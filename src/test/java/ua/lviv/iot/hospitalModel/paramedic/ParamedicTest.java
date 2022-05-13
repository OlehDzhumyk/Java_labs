package ua.lviv.iot.hospitalModel.paramedic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParamedicTest {

    public Paramedic person;

    @BeforeEach
    public void setUp(){
        person = new Paramedic("Sergiy", 25, 567);
    }

    @Test
    public void toCSV_Test() {
        String expected = "Sergiy, Bachelor, 25, NONE, 7000, 567";
        String actual = person.toCSV();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void  getHeadersTest() {
        String expected = "Name, Degree, Department, Salary, Age, numberOfCleanedRoom";
        String actual = person.getHeaders();
        Assertions.assertEquals(expected,actual);
    }

}
