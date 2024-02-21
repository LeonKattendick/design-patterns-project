package at.technikum.translator.language.zentari.interpreter;

import at.technikum.translator.language.LanguageInterpreter;

public class ZentariCharacterInterpreter extends LanguageInterpreter {

    @Override
    protected String encodeCurrent(String message) {

        message = message.replaceAll("a", "α");
        message = message.replaceAll("b", "β");
        message = message.replaceAll("y", "γ");
        message = message.replaceAll("o", "δ");

        return message;
    }

    @Override
    protected String decodeCurrent(String message) {

        message = message.replaceAll("α", "a");
        message = message.replaceAll("β", "b");
        message = message.replaceAll("γ", "y");
        message = message.replaceAll("δ", "o");

        return message;
    }
}
