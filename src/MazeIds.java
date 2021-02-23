public class MazeIds {
    private static int idRoom = 1;
    private static int idWall = 1;
    private static int idDoor = 1;

    public static int generateIdRoom(){
        int tmp = idRoom;
        idRoom++;
        return tmp;
    }

    public static int generateIdWall(){
        int tmp = idWall;
        idWall++;
        return tmp;
    }

    public static int generateIdDoor(){
        int tmp = idDoor;
        idDoor++;
        return tmp;
    }
}
