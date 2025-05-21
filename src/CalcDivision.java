public class CalcDivision {
    public double devide(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("No divide on zero");
        }
        return a / b;
    }
}