package br.com.buscape.yellowSubmarine.model;

/**
 * @author wagner on 18/09/17
 */
public enum EnumDirection {

    NORTE("NORTE"),
    SUL("SUL"),
    LESTE("LESTE"),
    OESTE("OESTE");

    private String enumDirection;

    EnumDirection(String direction){
        this.enumDirection = direction;
    }

    public String getEnumDirection(){
        return enumDirection;
    }

}
