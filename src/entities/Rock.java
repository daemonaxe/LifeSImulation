package entities;

import collections.EntityNames;

public class Rock extends Entity{
    public Rock(int x, int y) {
        super(x, y);
    }
    @Override
    public char getName() {
        return EntityNames.ROCK.getName();
    }
}
