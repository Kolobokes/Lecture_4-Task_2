public class Main {
    public static void main(String[] args) {
        float weight = 53;
        float height = (float) 1.70;

        BmiService service = new BmiService();
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
