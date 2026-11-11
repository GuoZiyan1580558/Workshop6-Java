public class Exercise5 {

    public static void main(String[] args) {
        String[] paragraphs = {
            "Lose all the weight you want.",
            "I can't I must work",
            "That would be like a keyword search.",
            "This would be Victoria.",
            "Join the party.",
            "To be or not to be.",
            "That is a question to test keyword search.",
            "Can you find a needle in a hay stack?",
            "This could be the last paragraph, but its not.",
            "Ada Lovelace is the worlds first programmer as of 1860."
        };

        String phrase = "keyword search";
        boolean found = false;

        System.out.println("Searching for: \"" + phrase + "\"");
        System.out.println();

        for (int i = 0; i < paragraphs.length; i++) {
            if (paragraphs[i].toLowerCase().contains(phrase.toLowerCase())) {
                System.out.println("Paragraph index " + i + ": " + paragraphs[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("The phrase \"" + phrase + "\" was not found in any paragraph.");
        }
    }
}
