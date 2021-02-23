public class Room extends MapSite {
    private MapSite south;
    private MapSite north;
    private MapSite west;
    private MapSite east;
    private final int id;
    {
        id = MazeIds.generateIdRoom();
    }

    public Room() {
        System.out.println("constructor room "+id);
    }

    @Override
    public void enter() {
        System.out.println("Enter in room");
    }

    void setSide(Direction d, MapSite site){

        if (d == Direction.North){
            north = site;
        } else if (d == Direction.South){
            south = site;
        } else if (d == Direction.East){
            east = site;
        } else if (d == Direction.West){
            west = site;
        }
        System.out.println("set " + d.toString() +
                " side of " + this.toString() + " to " +
                site.toString());
    }

    public MapSite getSide(Direction d){
        MapSite result = null;
        if (d == Direction.North){
            result = north;
        } else if (d == Direction.South){
            result = south;
        } else if (d == Direction.East){
            result = east;
        } else if (d == Direction.West){
            result = west;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nr=" + id +
                '}';
    }
}
