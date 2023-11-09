import static org.junit.Assert.*;
import org.junit.Test;

public class Main {

    @Test
    public void testDivisionByZero() {
        Expression left = new Numeral(10); // Ví dụ: số 10
        Expression right = new Numeral(1); // Ví dụ: số 0
        Division division = new Division(left, right);

        try {
            System.out.println(division.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Looix");
            assertEquals("divide by zero", e.getMessage());
        }
    }
}
