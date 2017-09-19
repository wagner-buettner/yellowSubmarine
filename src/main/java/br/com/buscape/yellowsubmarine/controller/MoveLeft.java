package br.com.buscape.yellowsubmarine.controller;

import br.com.buscape.yellowsubmarine.model.EnumDirection;
import br.com.buscape.yellowsubmarine.model.Submarine;

/**
 * @author wagner on 18/09/17
 */
public class MoveLeft implements Move {

    @Override
    public void moveSubmarine(Submarine submarine) {
        switch (submarine.getDirection()) {
            case NORTE:
                submarine.setDirection(EnumDirection.OESTE);
                break;
            case SUL:
                submarine.setDirection(EnumDirection.LESTE);
                break;
            case LESTE:
                submarine.setDirection(EnumDirection.NORTE);
                break;
            case OESTE:
                submarine.setDirection(EnumDirection.SUL);
                break;
            default:
                break;
        }
    }

}
