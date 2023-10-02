import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Function2Test {

    @Test
    void solve() {
        Function2 sinFunction = new Function2(0, 1, -1, 1);
        assertTrue(sinFunction.solve(0.1) - 0.099 < 0.1);
    }
}