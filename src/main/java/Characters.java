public class Characters {
    public static void main(String args[]) {
        removeAdjacentCharacters();
    }

    private static void removeAdjacentCharacters() {
        String word = "abbaca";
        StringBuilder uniqueCharacters = new StringBuilder();

        for(char character: word.toCharArray()) {
            int size = uniqueCharacters.length();
            if(size > 0 && uniqueCharacters.charAt(size - 1) == character){
                uniqueCharacters.deleteCharAt(size - 1);
            } else {
                uniqueCharacters.append(character);
            }
        }
        System.out.println(uniqueCharacters);
    }
}
