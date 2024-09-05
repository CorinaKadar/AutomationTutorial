package objectData;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class GeneralObject {

    // General object to read and update and object from JSON
    protected void fromJsonToObject(String filePath){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            // Read JSON from the provided path and update the current object
            objectMapper.readerForUpdating(this).readValue(new File(filePath));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
