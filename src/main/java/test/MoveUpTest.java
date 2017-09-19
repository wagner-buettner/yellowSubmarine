package test;

import br.com.buscape.yellowsubmarine.controller.MoveUp;
import br.com.buscape.yellowsubmarine.model.EnumDirection;
import br.com.buscape.yellowsubmarine.model.Submarine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wagner on 19/09/17
 */
public class MoveUpTest {
    private MoveUp moveUp;
    private final Submarine SUBMARINE_1 = new Submarine(1,2,-2, EnumDirection.NORTE);

    @Before
    public void setUp() {
        moveUp = new MoveUp();
    }

    @Test
    public void testIfMoveUpIsOk() {
        Integer AxisUpPlusOne = SUBMARINE_1.getZ() + 1;
        moveUp.moveSubmarine(SUBMARINE_1);
        assertEquals(AxisUpPlusOne, SUBMARINE_1.getZ());
    }

}