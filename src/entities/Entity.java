package entities;

import collections.CoordinatesXY;

public abstract class Entity {
    protected CoordinatesXY coordinates;

    public Entity(int x, int y) {
        coordinates = new CoordinatesXY(x,y);
    }
    public int getX() { return coordinates.getX(); }
    public int getY() { return coordinates.getY(); }

    public CoordinatesXY getCoordinates() {
        return coordinates;
    }

    public void setPosition(int x, int y) {
        coordinates.setX(x);
        coordinates.setY(y);
    }
    public abstract char getName();
}
