package br.com.buscape.yellowSubmarine.controller;

import br.com.buscape.yellowSubmarine.model.Submarine;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wagner on 18/09/17
 */
public class Control {

    private static final Map<String, Move> actions;

    static {
        actions = new HashMap<>();
		actions.put("L", new MoveLeft());
		actions.put("R", new MoveRight());
    }

    public String applyRule(String inputCoordinates) {

        Submarine submarine = new Submarine();

        String[] coordinateArray = inputCoordinates.split("");

        for (String coordinate : coordinateArray) {
            actions.get(coordinate).moveSubmarine(submarine);
        }

        return submarine.getLastPosition();
    }

}
