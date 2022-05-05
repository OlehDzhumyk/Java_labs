package ua.lviv.iot.hospitalModel;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.hospitalModel.Hospital;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.lviv.iot.hospitalModel.Department.DEPARTMENT_OF_SURGERY;


class HospitalTest {

    public Hospital person;

    @BeforeEach
    public void setUp(){
        person = new Hospital("Oleh", "Master",DEPARTMENT_OF_SURGERY ,15000, 38);
    }

    @Test
    public void toCSV_Test() {
        String expected = "Oleh, Master, 38, DEPARTMENT_OF_SURGERY, 15000";
        String actual = person.toCSV();
        assertEquals(expected,actual);
    }

    @Test
    public void  getHeadersTest() {
        String expected = "Name, Degree, Department, Salary, Age";
        String actual = person.getHeaders();
        assertEquals(expected,actual);
    }

    @Test
    public void equalsAndHashCodeTest() {
        EqualsVerifier.simple().forClass(Hospital.class).verify();
    }

}