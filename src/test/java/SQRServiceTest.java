import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void NumberOfSquaresTest1() {
        SQRService service = new SQRService();
        int actual = service.NumberOfSquares(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberOfSquaresTest2() {
        SQRService service = new SQRService();
        int actual = service.NumberOfSquares(100, 110);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberOfSquaresTest3() {
        SQRService service = new SQRService();
        int actual = service.NumberOfSquares(1, -9);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
