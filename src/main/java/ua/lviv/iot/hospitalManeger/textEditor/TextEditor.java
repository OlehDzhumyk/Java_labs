package ua.lviv.iot.hospitalManeger.textEditor;

import lombok.AllArgsConstructor;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AllArgsConstructor
public class TextEditor {
    String pathToInput;

    private String getTextFromFile(String filePath) {
        File file = new File(filePath);
        String text = null;

        try (Scanner scanner = new Scanner(file)) {
            StringBuilder result = new StringBuilder();
            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine()).append("\n");
            }

            text = result.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text;
    }

    public List<String> editText(char letter) {
        List<String> outPut = new LinkedList<>();
        String text = getTextFromFile(pathToInput);
        for (String sentence : divOnSentences(text)) {
            if (divOnWords(sentence).get(1).charAt(0) == letter) {
                System.out.println(divOnWords(sentence).get(1));
                outPut.add(divOnWords(sentence).get(1));
            }
        }
        return outPut;
    }

    private static List<String> divOnSentences(String text) {
        LinkedList<String> sentence = new LinkedList<>();
        Pattern pattern = Pattern.compile("\\w[^[.!?:\\n\\r]]*[.!?]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            sentence.add(text.substring(matcher.start(), matcher.end()));
            text = text.substring(matcher.end());
            matcher = pattern.matcher(text);
        }
        return sentence;
    }

    private static List<String> divOnWords(String sentence) {
        LinkedList<String> words = new LinkedList<>();
        Pattern pattern = Pattern.compile("[^\\s(.!?,:;\")]+");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            words.add(sentence.substring(matcher.start(), matcher.end()));
            sentence = sentence.substring(matcher.end());
            matcher = pattern.matcher(sentence);
        }
        return words;
    }

    public List<String> editText2(int length) {
        String text = getTextFromFile(pathToInput);
        List<String> alreadyPrintedWords = new LinkedList<>();
        for (String sentence : divOnSentences(text)) {
            if (sentence.charAt(sentence.length() - 1) == '?') {
                for (String word : divOnWords(sentence)) {
                    if (word.length() == length) {
                        if (!alreadyPrintedWords.contains(word)) {
                            System.out.println(word);
                            alreadyPrintedWords.add(word);
                        }
                    }
                }
            }
        }
        return alreadyPrintedWords;
}

}
