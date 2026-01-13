import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Func1Test {

    @Test
    void T1_conditionTrue() {
        assertEquals(0, Main.func1(100, 0, 2));
    }

    @Test
    void T2_conditionFalse_causesException() {
        assertThrows(ArithmeticException.class, () -> Main.func1(0, 0, 2));
    }
}
