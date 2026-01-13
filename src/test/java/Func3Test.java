import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Func3Test {

    @Test
    void T1_alwaysThrows() {
        assertThrows(ArithmeticException.class, () -> Main.func3(1));
    }
}
