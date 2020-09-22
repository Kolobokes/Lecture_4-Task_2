public class Main {
    public static void main(String[] args) {
        float weight = 53f;
        float height = 1.70f;

        BmiService service = new BmiService();
        float bmi = service.calculate(weight, height);
        System.out.printf("Индекс массы тела %.2f", bmi);
    }
}
