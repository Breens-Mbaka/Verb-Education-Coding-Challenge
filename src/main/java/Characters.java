import java.util.Arrays;
import java.util.List;

public class Characters {
    public static void main(String args[]) {
        removeDuplicateCharacters();
    }

    private static void removeDuplicateCharacters() {
        String letters = "abbaca";
        List<String> arrayOfCharacters = Arrays.asList(letters.split(""));
        StringBuilder uniqueCharacters = new StringBuilder();

        for (int i = 0; i < arrayOfCharacters.size(); i++) {
            for (int j = 1; j < arrayOfCharacters.size(); j++) {

                String firstLetter = arrayOfCharacters.get(i);
                String adjacentLetter = arrayOfCharacters.get(j);
                if (firstLetter == adjacentLetter) {
                    arrayOfCharacters.remove(arrayOfCharacters.get(i));
                    arrayOfCharacters.remove(arrayOfCharacters.get(j));
                }
            }
        }

    }
}
