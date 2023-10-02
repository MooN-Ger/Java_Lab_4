import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Functional1Test {

    @Test
    void calculate1() {
        Function1 linearFunction = new Function1(1, 0, 0, 10);
        Functional1<Function1> linearFunctionSFunctional = new Functional1<>();
        assertEquals(15.0, linearFunctionSFunctional.calculate(linearFunction), 0.001);
    }

    @Test
    void calculate2() {
        Function2 sinFunction = new Function2(1, 1, 0, 2 * Math.PI);
        Functional1<Function2> tFunctionSFunctional = new Functional1<>();
        assertEquals(0.0, tFunctionSFunctional.calculate(sinFunction), 0.001);
    }

    @Test
    void calculate3() {
        Function3 fLFunction = new Function3(1, 1, 1, 1, 0, 10);
        Functional1<Function3> fLFunctionSFunctional = new Functional1<>();
        assertEquals(3.0, fLFunctionSFunctional.calculate(fLFunction), 0.001);
    }

    @Test
    void calculate4() {
        Function4 eFunction = new Function4(1, 0, 0, 2);
        Functional1<Function4> eFunctionSFunctional = new Functional1<>();
        assertEquals(11.1073, eFunctionSFunctional.calculate(eFunction), 0.001);
    }

}