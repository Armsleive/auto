public class BmiService {
    public int calculate(int weightKilo, double heightMeter) {
        double result;
        result = (weightKilo / heightMeter * heightMeter);
        return (int) result;
    }
}
