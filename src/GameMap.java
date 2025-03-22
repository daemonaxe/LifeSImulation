import collections.CoordinatesXY;
import collections.MapSize;
import entities.Entity;

import java.util.HashMap;

public class GameMap {
    private HashMap<CoordinatesXY, Entity> filledCells;
    private MapSize mapSize;

    public GameMap(MapSize mapSize){
        filledCells=new HashMap<CoordinatesXY, Entity>();
        this.mapSize=mapSize;
    }

    public void putEntity(CoordinatesXY coordinates,Entity entity){
        if (isOccupied(coordinates)){
            System.out.println("2 объекта на одной клетке");
        }
        else filledCells.put(coordinates,entity);
    }

    public void removeEntity(CoordinatesXY coordinates){
        if (!isOccupied(coordinates)){
            System.out.println("Попытка удаления несуществующего объекта");
        }
        else filledCells.remove(coordinates);
    }

    public boolean isOccupied(CoordinatesXY coordinates){
        return filledCells.containsKey(coordinates);
    }

   public void moveEntity(CoordinatesXY coordinatesStart,CoordinatesXY coordinatesFinish,Entity entity){
        removeEntity(coordinatesStart);
        putEntity(coordinatesFinish,entity);
    }
}
