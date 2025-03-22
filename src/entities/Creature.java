package entities;

public abstract class Creature extends Entity{
    private int speed;
    private int hp;
    public Creature(int x, int y,int speed, int hp) {
        super(x, y);
        this.speed=speed;
        this.hp=hp;
    }
    abstract void makeMove();
}
