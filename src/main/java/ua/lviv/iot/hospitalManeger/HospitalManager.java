package ua.lviv.iot.hospitalManeger;

import ua.lviv.iot.hospitalModel.Department;
import ua.lviv.iot.hospitalModel.Hospital;
import java.util.List;


public interface HospitalManager {

    List<Hospital> sortByAge(List<Hospital> staff, boolean inAscendingOrder);

    List<Hospital> findByName(List<Hospital> staff, String name);

    List<Hospital> findByDepartment(List<Hospital> staff, Department department);


}
