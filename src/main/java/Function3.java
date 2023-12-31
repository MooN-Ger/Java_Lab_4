public class Function3 implements FunctionOfOneRealArg {

    private double a;
    private double b;
    private double c;
    private double d;

    private double leftLimit;
    private double rightLimit;

    @Override
    public double getLeftLimit() {
        return leftLimit;
    }

    @Override
    public double getRightLimit() {
        return rightLimit;
    }

    public Function3(double a, double b, double c, double d, double leftLimit, double rightLimit) {
        if (leftLimit > rightLimit) {
            throw new IllegalArgumentException("Bad limit borders");
        }
        if (c == 0 && d == 0) {
            throw new IllegalArgumentException("Divider can`t be zero");
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    @Override
    public double solve(double x) {
        if (x < leftLimit || x > rightLimit) {
            throw new IllegalArgumentException();
        }
        if ((c * x + d) == 0) {
            throw new IllegalArgumentException("denominator equals zero");
        }
        return (a * x + b) / (c * x + d);
    }

}
