package ua.lviv.iot;

import ua.lviv.iot.hospitalManeger.HospitalManagerImpl;
import ua.lviv.iot.hospitalManeger.HospitalWriter;
import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;
import ua.lviv.iot.hospitalModel.departmentOfPediatrics.Pediatrician;
import ua.lviv.iot.hospitalModel.departmentOfSurgery.Neurosurgeon;
import ua.lviv.iot.hospitalModel.paramedic.Paramedic;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args)  {

        List<Hospital> staff = new LinkedList<>();

        staff.add( new Neurosurgeon("Oleh", 38, 25) );
        staff.add( new Neurosurgeon("Olena", 43, 34) );
        staff.add( new Pediatrician("Andriy", 30, 1257) );
        staff.add( new Pediatrician("Anastasia", 34, 5340) );
        staff.add( new Pediatrician("Victoire", 26,532) );
        staff.add( new Paramedic("Sergiy", 25, 567) );
        staff.add( new Paramedic("Roman", 27, 310) );

        HospitalManagerImpl hospitalManager = new HospitalManagerImpl();

        for (Hospital hospitals : hospitalManager.findByDepartment(staff, Department.DEPARTMENT_OF_PEDIATRICS)) {
            System.out.println(hospitals.toString());
        }

        System.out.println();
        for (Hospital hospitals : hospitalManager.sortByAge(staff, false)) {
            System.out.println( hospitals.toString() );
        }

        System.out.println();
        for (Hospital hospitals : hospitalManager.findByName(staff,"Oleh")) {
            System.out.println( hospitals.toString() );
        }

        try { HospitalWriter.writeToFile(staff);

        }
        catch (IOException e){
            System.out.println("Блінб, вилітає((9(");
        }
    }

}


