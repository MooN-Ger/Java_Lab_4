public class Functional1<T extends FunctionOfOneRealArg> implements FunctionFromOneArg<T> {
    @Override
    public double calculate(T function) {
        return function.solve(function.getLeftLimit()) + function.solve(function.getRightLimit()) + function.solve((function.getRightLimit() - function.getLeftLimit()) / 2);
    }
}
