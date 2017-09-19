package test;

import br.com.buscape.yellowsubmarine.model.EnumDirection;
import br.com.buscape.yellowsubmarine.model.Submarine;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wagner on 19/09/17
 */
public class SubmarineTest {
    private static final Submarine SUBMARINE_1 = new Submarine();
    private static final Submarine SUBMARINE_2 = new Submarine(5,4,-2, EnumDirection.LESTE);

    @Test
    public void testDefaultConstructorWithoutAxisNORTEDirection(){
        assertEquals(0, SUBMARINE_1.getX().intValue());
        assertEquals(0, SUBMARINE_1.getY().intValue());
        assertEquals(0, SUBMARINE_1.getZ().intValue());
        assertEquals(EnumDirection.LESTE, SUBMARINE_1.getDirection());
    }

    @Test
    public void testConstructorWith542LESTE(){
        assertEquals(5, SUBMARINE_2.getX().intValue());
        assertEquals(4, SUBMARINE_2.getY().intValue());
        assertEquals(-2, SUBMARINE_2.getZ().intValue());
        assertEquals(EnumDirection.LESTE, SUBMARINE_2.getDirection());
    }

}