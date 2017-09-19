package br.com.buscape.yellowsubmarine.model;

/**
 * @author wagner on 18/09/17
 */
public enum EnumDirection {

    NORTE("NORTE"),
    SUL("SUL"),
    LESTE("LESTE"),
    OESTE("OESTE");

    private final String enumDirection;

    EnumDirection(String direction){
        this.enumDirection = direction;
    }

    public String getEnumDirection(){
        return enumDirection;
    }

}
