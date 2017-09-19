package test;

import br.com.buscape.yellowsubmarine.controller.MoveForward;
import br.com.buscape.yellowsubmarine.model.EnumDirection;
import br.com.buscape.yellowsubmarine.model.Submarine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author wagner on 19/09/17
 */
public class MoveForwardTest {

    private MoveForward moveForward;
    private final Submarine SUBMARINE_1 = new Submarine(1,2,-2, EnumDirection.LESTE);
    private final Submarine SUBMARINE_2 = new Submarine(2,2,-2, EnumDirection.LESTE);

    @Before
    public void setUp() {
        moveForward = new MoveForward();
    }

    @Test
    public void testMoveForwardLESTE(){
        moveForward.moveSubmarine(SUBMARINE_1);
        assertEquals(SUBMARINE_1.getX(), SUBMARINE_2.getX());
    }

}