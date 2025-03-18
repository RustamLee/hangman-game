package modelo;
import service.JsonDeserializer;
import java.util.*;

public class WorldStorage {
    private final HashSet<String> collection;
    private final Random random;

    public WorldStorage(String fileName) {
        this.random = new Random();
        JsonDeserializer jsonDeserializer = new JsonDeserializer();
        this.collection = jsonDeserializer.deserializeJson(fileName);
    }

    public Set<String> getCollection() {
        return collection;
    }

    public String getRandomWord() {
        if (collection.isEmpty()) {
            return null;
        }
        List<String> wordList = new ArrayList<>(collection);
        return wordList.get(random.nextInt(wordList.size()));
    }



}
