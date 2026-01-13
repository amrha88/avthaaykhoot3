import static org.junit.jupiter.api.Assertions.*;

import org.example.Main;
import org.junit.jupiter.api.Test;

public class WeakExampleStatementTest {

    @Test
    void statementCoverage_noBug() {
        int out =   weakmethod.weakMethod(1, 5);
        assertEquals(16, out); // (1+5)+10 = 16
    }

    @Test
    void branch_true_side() {
        assertEquals(16, weakmethod.weakMethod(1,5)); // TRUE branch
    }

    @Test
    void branch_false_side_triggersBug() {
        // כדי לנסות להגיע ל-FALSE branch חייבים a=0 -> ואז נזרקת חריגה
        assertThrows(ArithmeticException.class,
                () -> weakmethod.weakMethod(0, 5));
    }
}
