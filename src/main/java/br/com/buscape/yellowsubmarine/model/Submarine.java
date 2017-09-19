package br.com.buscape.yellowsubmarine.model;

/**
 * @author wagner on 17/09/17
 */
public class Submarine {

    private Integer x;
    private Integer y;
    private Integer z;
    private EnumDirection direction;

    public Submarine(){
        this.x= 0;
        this.y= 0;
        this.z= 0;
        this.direction = EnumDirection.NORTE;
    }

    public Submarine(Integer x, Integer y, Integer z, EnumDirection direction){
        this.x= x;
        this.y= y;
        this.z= z;
        this.direction = direction;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public EnumDirection getDirection() {
        return direction;
    }

    public void setDirection(EnumDirection direction) {
        this.direction = direction;
    }

    public String getLastPosition(){
        return x + " " + y + " " + z + " " + direction.getEnumDirection();
    }

    @Override
    public int hashCode() {
        int result = x.hashCode();
        result = 31 * result + y.hashCode();
        result = 31 * result + z.hashCode();
        result = 31 * result + direction.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true; }
        if (!(o instanceof Submarine)){ return false; }

        Submarine submarine = (Submarine) o;

        if (!getX().equals(submarine.getX())){ return false; }
        if (!getY().equals(submarine.getY())){ return false; }
        if (!getZ().equals(submarine.getZ())){ return false; }
        return getDirection().equals(submarine.getDirection());
    }

    @Override
    public String toString() {
        return "Submarine{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", direction='" + direction.getEnumDirection() + '\'' +
                '}';
    }

}
