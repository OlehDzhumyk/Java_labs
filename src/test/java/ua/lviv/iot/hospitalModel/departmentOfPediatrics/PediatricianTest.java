package ua.lviv.iot.hospitalModel.departmentOfPediatrics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.hospitalModel.departmentOfPediatrics.Pediatrician;

public class PediatricianTest {

    public Pediatrician person;

    @BeforeEach
    public void setUp(){
        person = new Pediatrician("Anastasia", 34, 5340);
    }

    @Test
    public void toCSV_Test() {
        String expected = "Anastasia, Master, 34, DEPARTMENT_OF_PEDIATRICS, 9000, 5340";
        String actual = person.toCSV();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void  getHeadersTest() {
        String expected = "Name, Degree, Department, Salary, Age, numberOfCuredChildren";
        String actual = person.getHeaders();
        Assertions.assertEquals(expected,actual);
    }

}
