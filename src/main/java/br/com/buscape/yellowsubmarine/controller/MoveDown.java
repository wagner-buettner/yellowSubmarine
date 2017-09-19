package br.com.buscape.yellowsubmarine.controller;

import br.com.buscape.yellowsubmarine.model.Submarine;

/**
 * @author wagner on 18/09/17
 */
public class MoveDown implements Move {

    @Override
    public void moveSubmarine(Submarine submarine) {
        submarine.setZ(submarine.getZ() - 1);
    }

}
