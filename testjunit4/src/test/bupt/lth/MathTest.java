package bupt.lth;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test(expected = Exception.class)
    public void factorial() throws Exception{
        new Math().factorial(-1);
        fail("没有抛出异常");
    }

    @Test
    public void fibonacci() {
    }
}