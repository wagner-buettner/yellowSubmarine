package br.com.buscape.yellowSubmarine.exceptions;

/**
 * @author wagner on 18/09/17
 */
public class SubmarineAboveSeaLevelException extends Exception {

    private static final long serialVersionUID = 4861569370744439439L;

    public SubmarineAboveSeaLevelException(){
        super("A submarine cannot be above sea level, can it? =]");
    }

}
