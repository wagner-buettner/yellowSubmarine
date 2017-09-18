package br.com.buscape.yellowsubmarine.validators;

import br.com.buscape.yellowsubmarine.exceptions.SubmarineAboveSeaLevelException;
import br.com.buscape.yellowsubmarine.model.Submarine;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author wagner on 18/09/17
 */
public final class SubmarineValidator {
    private static final Logger logger = LogManager.getLogger(SubmarineAboveSeaLevelException.class);

    private SubmarineValidator(){};

    public static void validate(Submarine submarine) throws SubmarineAboveSeaLevelException{
        if(submarine.getZ() > 0) {
            logger.error("Invalid Movement, while Submarine Z coordinate = {}", submarine.getZ());
            throw new SubmarineAboveSeaLevelException();
        }
    }
}
