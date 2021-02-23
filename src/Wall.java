public class Wall extends MapSite {
    private final int id;
    {
        id = MazeIds.generateIdWall();
    }

    public Wall() {
        System.out.println("constructor wall "+id);
    }

    @Override
    public void enter() {
        System.out.println("can not enter in wall ");
    }

    @Override
    public String toString() {
        return "Wall{" +
                "id=" + id +
                '}';
    }
}
