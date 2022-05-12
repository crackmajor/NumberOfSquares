import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService sqrService = new SQRService();
        int a = 200;
        int b = 300;
        int count = SQRService.NumberOfSquares(a, b);
        System.out.println(count);
    }
}