public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 98;
        double heightInM = 1.87;
        int index = service.calculate(weightInKg, heightInM);
        System.out.println("Ваш bmi-индекс " + index);
    }
}