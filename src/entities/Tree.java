package entities;

import collections.EntityNames;

public class Tree extends Entity {
    public Tree(int x, int y) {
        super(x, y);
    }
    @Override
    public char getName() {
        return EntityNames.TREE.getName();
    }
}
