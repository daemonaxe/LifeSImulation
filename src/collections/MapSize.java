package collections;

public class MapSize{
    private int width;
    private int height;

    public MapSize (int x, int y) {
        width = x;
        height = y;
    }
    public void setMapSize(int x,int y){
        width = x;
        height = y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

