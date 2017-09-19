package test;

import br.com.buscape.yellowsubmarine.controller.MoveRight;
import br.com.buscape.yellowsubmarine.model.EnumDirection;
import br.com.buscape.yellowsubmarine.model.Submarine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author wagner on 19/09/17
 */
public class MoveRightTest {

    private MoveRight moveRight;
    private final Submarine SUBMARINE_1 = new Submarine(1,2,-2, EnumDirection.NORTE);
    private final Submarine SUBMARINE_2 = new Submarine(1,2,-2, EnumDirection.LESTE);

    @Before
    public void setUp() {
        moveRight = new MoveRight();
    }

    @Test
    public void testIfMoveRightIsOk() {
        moveRight.moveSubmarine(SUBMARINE_1);
        assertEquals(SUBMARINE_1.getDirection(), SUBMARINE_2.getDirection());
    }
}
