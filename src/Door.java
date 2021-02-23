public class Door extends  MapSite {
    private Room room1;
    private Room room2;
    private final int id;
    {
        id = MazeIds.generateIdDoor();
    }

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
        System.out.println("construct door id " + id +
                "between " + room1 + " and " + room2);
    }

    @Override
    public void enter() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Door{" +
                "id=" + id +
                '}';
    }
}
