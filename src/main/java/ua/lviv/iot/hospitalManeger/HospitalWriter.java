package ua.lviv.iot.hospitalManeger;


import ua.lviv.iot.hospitalModel.Hospital;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HospitalWriter {

    public static void writeToFile(List<Hospital> staff) throws IOException {

        try (FileWriter list = new FileWriter("src/main/resources/doctorList/result.csv")) {
            String previousClass = "";
            for (Hospital doctor: staff) {
                if (!doctor.getClass().getSimpleName().equals(previousClass)) {
                    list.write(doctor.getHeaders() + "\r\n");
                    previousClass = doctor.getClass().getSimpleName();
                }
                list.write(doctor.toCSV());
                list.write("\r\n");
            }
        }
    }

}
