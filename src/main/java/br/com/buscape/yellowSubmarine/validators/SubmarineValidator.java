package br.com.buscape.yellowSubmarine.validators;

import br.com.buscape.yellowSubmarine.exceptions.SubmarineAboveSeaLevelException;
import br.com.buscape.yellowSubmarine.model.Submarine;

/**
 * @author wagner on 18/09/17
 */
public class SubmarineValidator {
    public static void validate(Submarine submarine) throws SubmarineAboveSeaLevelException{
        if(submarine.getZ() > 0) {
            throw new SubmarineAboveSeaLevelException();
        }
    }
}
