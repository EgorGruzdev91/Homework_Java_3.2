public class BmiService {
    public int calculate (double weightInKg, double heightInM) {
        double index = weightInKg / (heightInM*heightInM);
        return (int) index;
    }
}
