package ua.lviv.iot.hospitalManeger.textEditor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class TextEditorTest {

    TextEditor text;

    @BeforeEach
    public void setUp() {
        text = new TextEditor("src/main/resources/TextToEdit/input.txt");
    }

    @Test
    public void testReturnAllSecondWordsStartedBy() {
        List<String> actual = text.returnAllSecondWordsStartedBy('a');
        List<String> expected = new ArrayList<>();
        expected.add("am");
        expected.add("about");
        expected.add("a");
        expected.add("a");
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testReturnWordWithLengthGreaterThen() {
        List<String> actual =  text.returnWordWithLengthGreaterThen(3);
        List<String> expected = new ArrayList<>();
        expected.add("how");
        expected.add("are");
        expected.add("you");
        expected.add("And");
        expected.add("her");
        expected.add("the");
        Assertions.assertEquals(expected,actual);

    }

}