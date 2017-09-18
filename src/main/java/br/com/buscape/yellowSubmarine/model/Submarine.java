package br.com.buscape.yellowSubmarine.model;

/**
 * @author wagner on 17/09/17
 */
public class Submarine {

    private Integer x;
    private Integer y;
    private Integer z;
    private String direction;

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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
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
        if (this == o) return true;
        if (!(o instanceof Submarine)) return false;

        Submarine submarine = (Submarine) o;

        if (!getX().equals(submarine.getX())) return false;
        if (!getY().equals(submarine.getY())) return false;
        if (!getZ().equals(submarine.getZ())) return false;
        return getDirection().equals(submarine.getDirection());
    }

    @Override
    public String toString() {
        return "Submarine{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", direction='" + direction + '\'' +
                '}';
    }
}
