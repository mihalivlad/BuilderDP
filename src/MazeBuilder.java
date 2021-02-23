public class MazeBuilder {
    private Maze maze;

    public MazeBuilder() {
        maze = new Maze();
    }

    public MazeBuilder(MazeBuilder mazeBuilder) {
        maze = mazeBuilder.build();
    }
    public MazeBuilder(Maze maze) {
        this.maze = maze;
    }

    public Maze build(){
        return maze;
    }

    public Maze build(Maze maze){
        return maze;
    }

    public MazeBuilder addRoom(Room room){
        maze.addRoom(room);
        return this;
    }

    public MazeBuilder addRoom(RoomBuilder roomBuilder){
        maze.addRoom(roomBuilder.build());
        return this;
    }
}
