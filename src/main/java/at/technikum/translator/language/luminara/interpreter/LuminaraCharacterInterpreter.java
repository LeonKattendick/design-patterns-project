package at.technikum.translator.language.luminara.interpreter;

import at.technikum.translator.language.LanguageInterpreter;

public class LuminaraCharacterInterpreter extends LanguageInterpreter {

    @Override
    protected String encodeCurrent(String message) {

        message = message.replace("a", "α");
        message = message.replace("b", "β");
        message = message.replace("y", "γ");
        message = message.replace("o", "δ");

        return message;
    }

    @Override
    protected String decodeCurrent(String message) {

        message = message.replace("α", "a");
        message = message.replace("β", "b");
        message = message.replace("γ", "y");
        message = message.replace("δ", "o");

        return message;
    }
}
