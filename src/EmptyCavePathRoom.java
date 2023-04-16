public class EmptyCavePathRoom extends MapTile{
    public EmptyCavePathRoom(int x, int y) {
        super(x, y);
    }
    private final String[] ECP_INTRO = {"This seems like an empty Path.", "Do not be deceived by this arid space or risk being shocked.",
            "A break from the creepy crawlers? Lucky you!", "The walls shine with moist. Look out for crawlers.",
            "ECHO!... This place seems pretty empty.", "Other than the dried bones on the walls... You seem to be the only one here"
    };
    public String intro_text(){
            return ECP_INTRO[(int) (java.lang.Math.random() * ECP_INTRO.length)];
    }
}
