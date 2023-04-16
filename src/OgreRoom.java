import java.util.Random;

public class OgreRoom extends EnemyRoom{
    public OgreRoom(int x, int y, Enemy enemy) {
        super(x, y, enemy);
    }

    private final String[] OGRE_INTRO = {"Ugly beings lurk around you. Stay clear.", "Life and Death are the only two outcomes being here", "Ogres are not the most friendly",
            "Small beady eyes watch you from a corner. Be stealthy.","Ogres do not usually favor your kind. Don't stick around to find out."};

    public String intro_text(){
        return OGRE_INTRO[new Random().nextInt(OGRE_INTRO.length)];
    }
}
