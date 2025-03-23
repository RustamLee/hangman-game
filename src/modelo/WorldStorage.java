package modelo;
import service.JsonDeserializer;
import java.util.*;

public class WorldStorage {
    private final Set<String> words;
    private final Random random;

    public WorldStorage(String fileName) {
        this.random = new Random();
        JsonDeserializer jsonDeserializer = new JsonDeserializer();
        this.words = jsonDeserializer.deserializeJson(fileName);
    }

    public Optional<String> getRandomWord() {
        if (words.isEmpty()) {
            return Optional.empty();
        }
        List<String> wordList = new ArrayList<>(words);
        return Optional.of(wordList.get(random.nextInt(wordList.size())));
    }


}
