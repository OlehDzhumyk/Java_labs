package ua.lviv.iot.hospitalManeger;

import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalManagerImpl implements HospitalManager {

    @Override
    public List<Hospital> sortByAge(List<Hospital> staff, boolean inAscendingOrder) {
        if (inAscendingOrder) {
            return staff.stream()
                    .sorted(Comparator.comparing(Hospital::getAge)).toList();
        }
        return staff.stream()
                .sorted(Comparator.comparing(Hospital::getAge).reversed()).toList();
    }

    @Override
    public List<Hospital> findByName(List<Hospital> staff, String name) {
        return staff.stream()
                .filter(hospital -> hospital.getName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Hospital> findByDepartment(List<Hospital> staff, Department department) {
        return staff.stream()
                .filter(hospital -> hospital.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

}
