package br.com.buscape.yellowsubmarine.controller;

import br.com.buscape.yellowsubmarine.exceptions.SubmarineAboveSeaLevelException;
import br.com.buscape.yellowsubmarine.model.Submarine;
import br.com.buscape.yellowsubmarine.validators.SubmarineValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wagner on 18/09/17
 */
public class Control {
    private static final Logger logger = LogManager.getLogger(Control.class);

    private static final Map<String, Move> actions;

    static {
        actions = new HashMap<>();
		actions.put("L", new MoveLeft());
		actions.put("R", new MoveRight());
		actions.put("U", new MoveUp());
		actions.put("D", new MoveDown());
		actions.put("M", new MoveForward());
    }

    public String applyRule(String inputCoordinates) throws SubmarineAboveSeaLevelException {

        logger.info("Applying rule for Input: {}", inputCoordinates);
        Submarine submarine = new Submarine();

        String[] coordinateArray = inputCoordinates.split("");

        for (String coordinate : coordinateArray) {
            actions.get(coordinate).moveSubmarine(submarine);

            SubmarineValidator.validate(submarine);
        }

        logger.info("Result for Input: {}", submarine.getLastPosition());
        return submarine.getLastPosition();
    }

}
