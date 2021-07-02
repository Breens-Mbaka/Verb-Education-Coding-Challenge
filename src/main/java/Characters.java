public class Characters {
    public static void main(String args[]) {
        removeAdjacentCharacters();
    }

    private static void removeAdjacentCharacters() {
        String word = "xyaaya";//input string
        StringBuilder uniqueCharacters = new StringBuilder();//output string

        for(char character: word.toCharArray()) {
            int size = uniqueCharacters.length();
            //If the last occurs character equals the current character remove,
            // otherwise add it to our output
            if(size > 0 && uniqueCharacters.charAt(size - 1) == character){
                uniqueCharacters.deleteCharAt(size - 1);
            } else {
                uniqueCharacters.append(character);
            }
        }
        System.out.println(uniqueCharacters);
    }
}
