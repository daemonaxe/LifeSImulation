package entities;

import collections.EntityNames;

//todo продумать возобновление
public class Grass extends Entity{
    public Grass(int x, int y) {
        super(x, y);
    }
    @Override
    public char getName() {
        return EntityNames.GRASS.getName();
    }
}
