public class GiantSpiderRoom extends EnemyRoom{
    public GiantSpiderRoom(int x, int y, Enemy enemy) {
        super(x, y, enemy);
    }
    private String[] OGRE_INTRO = {"Long legs and cobwebs.... a dreamland ", "Life and Death are enemies here.How friendly can a spider be",
            "Many little eyes watch you from a corner. Be stealthy.","EW. I hate the webs "};

    public String intro_text(){
        return OGRE_INTRO[(int) (java.lang.Math.random() * OGRE_INTRO.length)];
    }
}
