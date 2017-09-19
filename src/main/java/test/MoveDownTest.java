package test;

import br.com.buscape.yellowsubmarine.controller.MoveDown;
import br.com.buscape.yellowsubmarine.model.EnumDirection;
import br.com.buscape.yellowsubmarine.model.Submarine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wagner on 19/09/17
 */
public class MoveDownTest {
    private MoveDown moveDown;
    private final Submarine SUBMARINE_1 = new Submarine(1,2,-2, EnumDirection.NORTE);

    @Before
    public void setUp() {
        moveDown = new MoveDown();
    }

    @Test
    public void testIfMoveDownIsOk() {
        Integer AxisZ = SUBMARINE_1.getZ() - 1;
        moveDown.moveSubmarine(SUBMARINE_1);
        assertEquals(AxisZ, SUBMARINE_1.getZ());
    }

}