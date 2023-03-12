import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class World {
    // Class level variables
    public static String[][] _world; //2-dimensional array
    static Point Starting_Position = new Point(0, 0);//ArrayList(add or remove to list), < > (angle bracket- Generics)
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

    public void load_tiles(){
        //parses a file that descries the world space into the world object
        List<String> rows = new ArrayList<String>();
        try{ //reading for map.txt(check if the file is present)
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt"));
            String row;
            while((row = f.readLine()) != null){
                rows.add(row);
            }
            f.close();
            int x_max = rows.get(0).split("\t").length;
            _world = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            for(int y = 0; y < rows.size(); y++){
                //nested function 2-dimensional for loop
                cols = rows.get(y).split("\t");
                for(int x = 0; x < x_max; x++){
                    tile_name = cols[x];
                    if(tile_name.equals("StartingRoom")){
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = tile_name.equals(" ") ? null : tile_name;

                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public static MapTile title_exists(int x, int y){
        MapTile mt = null;
        return mt;
    }

}
