package entities;

import collections.EntityNames;

//todo добавить поглощание продоумать движенеи
public class Herbivore extends Creature{
    public Herbivore(int x, int y, int speed, int hp) {
        super(x, y, speed, hp);
    }

    @Override
    void makeMove() {

    }

    @Override
    public char getName() {
        return EntityNames.HERBIVORE.getName();
    }
}
