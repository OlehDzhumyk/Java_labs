package ua.lviv.iot.hospitalModel.departmentOfSurgery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.hospitalModel.departmentOfSurgery.Neurosurgeon;

public class NeurosurgeonTest {

    public Neurosurgeon person;

    @BeforeEach
    public void setUp(){
        person = new Neurosurgeon("Oleh", 38, 25);
    }

    @Test
    public void toCSV_Test() {
        String expected = "Oleh, Master, 38, DEPARTMENT_OF_SURGERY, 15000, 25";
        String actual = person.toCSV();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void  getHeadersTest() {
        String expected = "Name, Degree, Department, Salary, Age, numberOfOperations";
        String actual = person.getHeaders();
        Assertions.assertEquals(expected,actual);
    }

}
