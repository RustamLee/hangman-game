package service;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class JsonDeserializer {

    private Gson gson;

    public JsonDeserializer() {
        this.gson = new Gson();

    }
    public HashSet<String> deserializeJson(String fileName) {
        String[] wordsArray = null;
        try (FileReader fileReader = new FileReader(fileName)) {
            wordsArray = gson.fromJson(fileReader, String[].class);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        if (wordsArray != null) {
            return new HashSet<>(Set.of(wordsArray));
        } else {
            return new HashSet<>();
        }
    }
}
