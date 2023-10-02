import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Function4Test {

    @Test
    void solve() {
        Function4 expFunction = new Function4(1, 0, 1, 2);
        assertTrue(expFunction.solve(2) - 7.38 < 0.1);
    }
}