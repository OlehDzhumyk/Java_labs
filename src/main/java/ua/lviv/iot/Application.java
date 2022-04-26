package ua.lviv.iot;

import ua.lviv.iot.hospitalManeger.HospitalManagerImpl;
import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;
import ua.lviv.iot.hospitalModel.departmentOfPediatrics.Pediatrician;
import ua.lviv.iot.hospitalModel.departmentOfSurgery.Neurosurgeon;
import ua.lviv.iot.hospitalModel.paramedic.Paramedic;

import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Hospital> staff = new LinkedList<>();

        staff.add( new Neurosurgeon("Oleh", 38, 1001) );
        staff.add( new Neurosurgeon("Olena", 43, 1002) );
        staff.add( new Pediatrician("Andriy", 30, 1003) );
        staff.add( new Pediatrician("Anastasia", 34, 1004) );
        staff.add( new Pediatrician("Victoire", 26, 1005) );
        staff.add( new Paramedic("Sergiy", 25, 1006) );
        staff.add( new Paramedic("Roman", 27, 1007) );

        HospitalManagerImpl manager = new HospitalManagerImpl();

        for (Hospital hospitals : manager.findByDepartment(staff, Department.DEPARTMENT_OF_PEDIATRICS)) {
            System.out.println(hospitals.toString());
        }

        System.out.println();
        for (Hospital hospitals : manager.sortByAge(staff, false)) {
            System.out.println( hospitals.toString() );
        }

        System.out.println();
        for (Hospital hospitals : manager.findByName(staff,"Oleh")) {
            System.out.println( hospitals.toString() );
        }

    }

}


