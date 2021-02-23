public class RoomBuilder {
    private Room room;

    public RoomBuilder() {
        room = new Room();
        room.setSide(Direction.East, new Wall());
        room.setSide(Direction.West, new Wall());
        room.setSide(Direction.North, new Wall());
        room.setSide(Direction.South, new Wall());
    }

    public RoomBuilder(RoomBuilder roomBuilder) {
        room = roomBuilder.build();
    }
    public RoomBuilder(Room room) {
        this.room = room;
    }

    public Room build(){
        return room;
    }

    public Room build(Room room){
        return room;
    }

    public RoomBuilder setDoor(Direction d,Door door){
        room.setSide(d,door);
        return this;
    }

    public RoomBuilder setWall(Direction d,Wall wall){
        room.setSide(d,wall);
        return this;
    }

    public RoomBuilder clear(){
        room = new Room();
        room.setSide(Direction.East, new Wall());
        room.setSide(Direction.West, new Wall());
        room.setSide(Direction.North, new Wall());
        room.setSide(Direction.South, new Wall());
        return this;
    }
}
