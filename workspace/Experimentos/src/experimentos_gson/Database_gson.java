package experimentos_gson;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Database_gson {

    private String file = "warpCoords.json";
    private SimpleCoords coordList;

    private void serializeSimpleCoords(String name){
        SimpleCoords coords = new SimpleCoords(
                name,
                "World_1",
                0,
                70,
                0
                );
        Gson gson = new Gson();
        try {
            gson.toJson(coords, new FileWriter(this.file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Location deserializeSimpleCoords(SimpleCoords coords){
        this.loadFile();
        Gson gson = new Gson();
        //SimpleCoords coords = gson.fromJson(json, SimpleCoords.class);
        Location location = new Location(
                coords.world,
                coords.x,
                coords.y,
                coords.z
        );
        return location;
    }

    private void loadFile() {
        Reader reader;
        Gson gson = new Gson();
        //Map<?, ?> map;


        try {
            reader = Files.newBufferedReader(Paths.get(this.file));
            this.coordList = gson.fromJson(reader, SimpleCoords.class);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //this.coordList = map;
    }

    public void setWarp(String name, Location location){
        serializeSimpleCoords(name, location);
    }

    public Location getWarp(){
        Location location = deserializeSimpleCoords(this.coordList);
        return location;
    }

}
