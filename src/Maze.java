import java.util.HashSet;
import java.util.Set;

public class Maze {
    private Set<Room> rooms = new HashSet<>();
    public Maze() {
        System.out.println("maze constructor");
    }

    public void addRoom(Room room){
        if(rooms.contains(room)){
            return;
        }
        rooms.add(room);
    }
}
