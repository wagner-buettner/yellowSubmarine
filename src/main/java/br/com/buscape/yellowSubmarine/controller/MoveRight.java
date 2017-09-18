package br.com.buscape.yellowSubmarine.controller;

import br.com.buscape.yellowSubmarine.model.EnumDirection;
import br.com.buscape.yellowSubmarine.model.Submarine;

/**
 * @author wagner on 18/09/17
 */
public class MoveRight implements Move {

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
