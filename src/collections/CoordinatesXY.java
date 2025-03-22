package collections;

public class CoordinatesXY {
    private int x,y;
    public CoordinatesXY (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public CoordinatesXY (CoordinatesXY coordinatesXY) {
        this.x = coordinatesXY.x;
        this.y = coordinatesXY.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
