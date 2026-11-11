public class Exercise3 {

    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();
        for (int w = 0; w < words.length; w++) {
            char[] letters = words[w].toCharArray();

            // Keep any punctuation at the end of the word where it is
            int lastLetter = letters.length - 1;
            while (lastLetter >= 0 && !Character.isLetter(letters[lastLetter])) {
                lastLetter--;
            }

            char[] reversed = new char[letters.length];
            for (int i = 0; i <= lastLetter; i++) {
                reversed[i] = letters[lastLetter - i];
            }
            for (int i = lastLetter + 1; i < letters.length; i++) {
                reversed[i] = letters[i];
            }

            if (w > 0) {
                result.append(' ');
            }
            for (int i = 0; i < reversed.length; i++) {
                result.append(reversed[i]);
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + result);
    }
}
