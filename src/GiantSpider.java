public class GiantSpider extends Enemy{
    public GiantSpider() {
        super("Giant Spider", 10, 6);
    }

    public static void drawSpider(){
        System.out.println("" +
                "                / \\  / \\\n" +
                "               |   ||   |\n" +
                "               |   ||   |\n" +
                "         _     |  _||_  |     _\n" +
                "        | \\_   \\/ _  _ \\/   _/ |\n" +
                "        \\  \\_  \\// \\_/ \\\\  _/  /\n" +
                "         \\_  \\_/|\\     /|\\_/  _/\n" +
                "           \\_   \\ | --- | /   _/\n" +
                "           / \\  / \\     / \\  / \\\n" +
                "               | | |   | |\n" +
                "               | | |   | |\n" +
                "               | | |   | |\n" +
                "               |_|_|   |_|_|\n");
    }
}
