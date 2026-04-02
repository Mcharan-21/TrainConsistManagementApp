import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.*;

public class TrainConsistManagementAppTest {

    @Test
    void testValidInputs() {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        Pattern p1 = Pattern.compile("TRN-\\d{4}");
        Pattern p2 = Pattern.compile("PET-[A-Z]{2}");

        assertTrue(p1.matcher(trainId).matches());
        assertTrue(p2.matcher(cargoCode).matches());
    }

    @Test
    void testInvalidInputs() {

        String trainId = "TRN-12";
        String cargoCode = "PET-A1";

        Pattern p1 = Pattern.compile("TRN-\\d{4}");
        Pattern p2 = Pattern.compile("PET-[A-Z]{2}");

        assertFalse(p1.matcher(trainId).matches());
        assertFalse(p2.matcher(cargoCode).matches());
    }
}