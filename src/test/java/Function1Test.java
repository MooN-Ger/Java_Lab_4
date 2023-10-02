import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Function1Test {

    @Test
    public void solve() {
        Function1 linearFunction = new Function1(1, 2, 1, 10);
        assertEquals(linearFunction.solve(2), 4);
    }


}