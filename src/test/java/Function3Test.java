import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Function3Test {

    @Test
    void solve() {
        Function3 rationalFunction = new Function3(10, 2, 1,1, 0, 10);
        assertTrue(rationalFunction.solve(2) - 7.333 < 0.1);
    }
}