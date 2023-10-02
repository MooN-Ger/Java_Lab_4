public interface FunctionFromOneArg<T extends FunctionOfOneRealArg> {
    double calculate(T function);
}
