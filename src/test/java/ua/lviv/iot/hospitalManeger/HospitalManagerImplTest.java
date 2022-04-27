package ua.lviv.iot.hospitalManeger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;
import ua.lviv.iot.hospitalModel.departmentOfPediatrics.Pediatrician;
import ua.lviv.iot.hospitalModel.departmentOfSurgery.Neurosurgeon;
import ua.lviv.iot.hospitalModel.paramedic.Paramedic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HospitalManagerImplTest {

    List<Hospital> staff;
    HospitalManagerImpl hospitalManager;
    List<Hospital> expected;
    @BeforeEach
    void setUp() {
        hospitalManager = new HospitalManagerImpl();
        staff = new LinkedList<>();
        staff.add( new Neurosurgeon("Oleh", 38) );
        staff.add( new Neurosurgeon("Olena", 43) );
        staff.add( new Pediatrician("Andriy", 30) );
        staff.add( new Pediatrician("Anastasia", 34) );
        staff.add( new Pediatrician("Victoire", 26) );
        staff.add( new Paramedic("Sergiy", 25) );
        staff.add( new Paramedic("Roman", 27) );
        expected = new ArrayList<>();

    }

    @Test
    void sortByAgeByDescendingTest() {
        var actual = hospitalManager.sortByAge(staff, false);
        expected.add(staff.get(1));
        expected.add(staff.get(0));
        expected.add(staff.get(3));
        expected.add(staff.get(2));
        expected.add(staff.get(6));
        expected.add(staff.get(4));
        expected.add(staff.get(5));

        if (!actual.equals(expected))
            fail();

    }

    @Test
    void sortByAgeByAscendingTest() {
        var actual = hospitalManager.sortByAge(staff, true);
        expected.add(staff.get(5));
        expected.add(staff.get(4));
        expected.add(staff.get(6));
        expected.add(staff.get(2));
        expected.add(staff.get(3));
        expected.add(staff.get(0));
        expected.add(staff.get(1));

        if (!actual.equals(expected))
            fail();

    }
    @Test
    void findByNameTest() {
        var actual = hospitalManager.findByName(staff, "Roman");
        ArrayList<Hospital> expected = new ArrayList<>();
        expected.add(staff.get(6));

        if (!actual.equals(expected))
            fail();

    }

    @Test
    void findByDepartmentTest() {
        var actual = hospitalManager.findByDepartment(staff, Department.DEPARTMENT_OF_PEDIATRICS);
        ArrayList<Hospital> expected = new ArrayList<>();
        expected.add(staff.get(2));
        expected.add(staff.get(3));
        expected.add(staff.get(4));

        if (!actual.equals(expected))
            fail();

    }

}