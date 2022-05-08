package ua.lviv.iot.hospitalManeger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.hospitalModel.Hospital;
import ua.lviv.iot.hospitalModel.departmentOfPediatrics.Pediatrician;
import ua.lviv.iot.hospitalModel.departmentOfSurgery.Neurosurgeon;
import ua.lviv.iot.hospitalModel.paramedic.Paramedic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class HospitalWriterTest {

    List<Hospital> staff;

    @BeforeEach
    public void setUp() {
        staff = new LinkedList<>();
        staff.add(new Neurosurgeon("Oleh", 38, 25));
        staff.add(new Neurosurgeon("Olena", 43, 34));
        staff.add(new Pediatrician("Andriy", 30, 1257));
        staff.add(new Pediatrician("Anastasia", 34, 5340));
        staff.add(new Pediatrician("Victoire", 26, 532));
        staff.add(new Paramedic("Sergiy", 25, 567));
        staff.add(new Paramedic("Roman", 27, 310));
        HospitalWriter.writeToFile(staff);
    }

    @Test
    void fileEqualTest() {
        try (
                FileReader expected = new FileReader("src/test/testResources/doctorList/expected.csv");
                BufferedReader expectedBuf = new BufferedReader(expected);

                FileReader actual = new FileReader("src/main/resources/doctorList/result.csv");
                BufferedReader actualBuf = new BufferedReader(actual)

        ) {
            String line = "";
            while (line != null) {
                Assertions.assertEquals(expectedBuf.readLine(), line = actualBuf.readLine());
            }
        } catch (IOException e) {
            System.out.println("Nu vse Exception");
        }
    }

}