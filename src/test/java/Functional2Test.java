import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class Functional2Test {

    @Test
    void calculate1() {
        Function1 linearF = new Function1(3, 20, 0, 10);
        Functional2<Function1> linearFIFunctional = new Functional2<>(0, 10);
        assertEquals(350.0, linearFIFunctional.calculate(linearF), 0.001);
    }

    @Test
    void calculate2() {
        Function2 tFunction = new Function2(3, 0.5, 0, 2 * Math.PI);
        Functional2<Function2> tFunctionIFunctional = new Functional2<>(0, 2 * Math.PI);
        assertEquals(12.0, tFunctionIFunctional.calculate(tFunction), 0.001);
    }

    @Test
    void calculate3() {
        Function3 fLFunction = new Function3(3, 20, 6, 40, 0, 20);
        Functional2<Function3> fLFunctionIFunctional = new Functional2<>(0, 20);
        assertEquals(10.0, fLFunctionIFunctional.calculate(fLFunction), 0.001);
    }

    @Test
    void calculate4() {
        Function4 eFunction = new Function4(1.8, 1.6, 1, 2);
        Functional2<Function4> eFunctionIFunctional = new Functional2<>(1, 2);
        assertEquals(10.00739368, eFunctionIFunctional.calculate(eFunction), 0.0001);
    }
}