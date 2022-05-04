package hospitalManeger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class HospitalWriterTest {

    @Test
    void fileEqualTest() throws IOException {
        try (
                FileReader expected = new FileReader("src/test/java/testResources/doctorList/expected.csv");
                BufferedReader expectedBuf = new BufferedReader(expected);

                FileReader actual = new FileReader("src/main/resources/doctorList/result.csv");
                BufferedReader actualBuf = new BufferedReader(actual)

        ) {
            String line = "";
            while (line != null) {
                Assertions.assertEquals(expectedBuf.readLine(), line = actualBuf.readLine());
            }
        }
    }

}