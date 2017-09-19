package test;

import br.com.buscape.yellowsubmarine.controller.Control;
import br.com.buscape.yellowsubmarine.exceptions.SubmarineAboveSeaLevelException;
import br.com.buscape.yellowsubmarine.model.EnumDirection;
import br.com.buscape.yellowsubmarine.model.Submarine;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author wagner on 18/09/17
 */
public class ControlTest {

    private static final String INPUT_1 = "LMRDDMMUU";
    private static final String OUTPUT_1  = new Submarine(-1,2,0, EnumDirection.NORTE).getLastPosition();
    private static final String INPUT_ABOVE_SEA_LEVEL = "LMMMRRRMLMRRMMMUUUUUU";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testIfInput1isOK() throws SubmarineAboveSeaLevelException{
        Control control = new Control();
        assertEquals(control.applyRule(INPUT_1), OUTPUT_1);
    }

    @Test
    public void testIfInputAboseSeaLeveIsNotOk() throws SubmarineAboveSeaLevelException{
        thrown.expect(SubmarineAboveSeaLevelException.class);
        Control control = new Control();
        String output = control.applyRule(INPUT_ABOVE_SEA_LEVEL);
        assertNotNull(output);
    }

}