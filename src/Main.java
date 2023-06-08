public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight_in_kg = 92;
        double height_in_m = 1.82;
        int index = service.calculate(weight_in_kg, height_in_m);
        System.out.println("Ваш bmi-индекс " + index);
    }
}