package pl.coderslab.homeworks.strings;


public class Main07 {

    public static void main(String[] args) {
        String sentence = "I love and hate Java how";
        String[] forbiddenWords = {"hate", "love"};

        System.out.println(censor(sentence, forbiddenWords));


    }

    public static String censor(String str, String[] words) {
        String censored = "";
        String[] sentenceSplit = str.split(" ");

        for (String sentence : sentenceSplit) {
            for (String word : words) {
                if (sentence.contains(word)) {
                    censored = str.replaceAll(word, "****");
                }
            }
        }
        return censored;
    }
}
