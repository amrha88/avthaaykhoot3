import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Func2Test {

    private float extractQ(String s) {
        // "p=20.00, q=0.05"
        String qPart = s.split(",")[1].trim(); // "q=0.05"
        return Float.parseFloat(qPart.split("=")[1]);
    }

    @Test
    void T1_pNotZero_valid() {
        String r = Main.func2(10.0f, 1.0f);
        float q = extractQ(r);
        assertFalse(Float.isInfinite(q) || Float.isNaN(q));
    }

    @Test
    void T2_pZero_invalidInfinity() {
        String r = Main.func2(0.0f, 10.0f);
        float q = extractQ(r);
        assertTrue(Float.isInfinite(q) || Float.isNaN(q)); // התקלה נחשפה
    }
}

