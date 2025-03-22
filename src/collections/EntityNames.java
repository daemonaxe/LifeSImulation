package collections;

public enum EntityNames {
    GRASS('G'),
    ROCK('R'),
    TREE('T'),
    HERBIVORE('H'),
    PREDATOR('P');
    private final char symbol;
    EntityNames(char symbol){
        this.symbol=symbol;
    }
    public char getName(){
        return symbol;
    }
}
