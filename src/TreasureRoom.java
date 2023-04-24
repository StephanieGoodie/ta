public class TreasureRoom extends MapTile{
    public TreasureRoom(int x, int y) {
        super(x, y);
    }
    private String[] TREAS_INTRO = {"A shining stone... looks valuable.", "Places like this seem too good to be true, have an eye out.",
            "Take what you can, but remember... these aren't yours.", "Silvers, Gold, AND diamonds! Look out for traps ",
            "The ground glimmers. Woah ","Let's hope not to meet any scary scavengers here. Quick! Make your pick "};

    public String intro_text(){
        return TREAS_INTRO[(int) (java.lang.Math.random() * TREAS_INTRO.length)];
    }

    public void modify_player(Player player){}
}
