public class Characters {
    public static void main(String args[]) {
        removeDuplicateCharacters();
    }

    private static void removeDuplicateCharacters() {
        String letters = "abbaca";
        String[] arrayOfCharacters = letters.split("");
        StringBuilder uniqueCharacters = new StringBuilder();

        for (int i = 0; i < arrayOfCharacters.length; i++) {
            for (int j = 1; j < arrayOfCharacters.length; j++) {

                String firstLetter = arrayOfCharacters[i];
                String adjacentLetter = arrayOfCharacters[j];

            }
        }
    }
}
