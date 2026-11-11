public class Exercise4 {

    public static void main(String[] args) {
        String codedMessage = "G tgsl Qefe.";

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] key = "crgzavibsdoeqfhujxklwmynpt".toCharArray();

        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < codedMessage.length(); i++) {
            char ch = codedMessage.charAt(i);
            char lower = Character.toLowerCase(ch);
            int position = -1;

            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == lower) {
                    position = j;
                    break;
                }
            }

            if (position == -1) {
                decoded.append(ch);
            } else if (Character.isUpperCase(ch)) {
                decoded.append(Character.toUpperCase(key[position]));
            } else {
                decoded.append(key[position]);
            }
        }

        System.out.println("Coded message:   " + codedMessage);
        System.out.println("Decoded message: " + decoded);
    }
}
