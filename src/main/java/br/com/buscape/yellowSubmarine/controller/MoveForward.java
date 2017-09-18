package br.com.buscape.yellowSubmarine.controller;

import br.com.buscape.yellowSubmarine.model.Submarine;

/**
 * @author wagner on 18/09/17
 */

public class MoveForward implements Move {

    @Override
    public void moveSubmarine(Submarine submarine) {
        switch (submarine.getDirection()) {
            case NORTE:
                submarine.setY(submarine.getY()+1);
                break;
            case SUL:
                submarine.setY(submarine.getY()-1);
                break;
            case LESTE:
                submarine.setX(submarine.getX()+1);
                break;
            case OESTE:
                submarine.setX(submarine.getX()-1);
                break;
            default:
                break;
        }
    }

}
