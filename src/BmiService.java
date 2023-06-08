public class BmiService {
    public int calculate (double weight_in_kg, double height_in_m) {
        double index = weight_in_kg / (height_in_m*height_in_m);
        return (int) index;
    }
}
