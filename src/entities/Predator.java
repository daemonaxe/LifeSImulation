package entities;

public class Predator extends Creature{
    private int attack;
    public Predator(int x, int y, int speed, int hp,int attack) {
        super(x, y, speed, hp);
        this.attack=attack;
    }

    //todo сделать реализацию в общем классе Creature
    @Override
    void makeMove() {

    }
    void makeAttack(){}

    @Override
    public char getName() {
        return 0;
    }
}
