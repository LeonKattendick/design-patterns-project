package at.technikum.translator.language.zentari;

import at.technikum.translator.language.LanguageInterpreter;
import at.technikum.translator.language.TranslationStrategy;
import at.technikum.translator.language.zentari.interpreter.ZentariCharacterInterpreter;

public class ZentariStrategy implements TranslationStrategy {

    private final LanguageInterpreter interpreter;

    public ZentariStrategy() {
        this.interpreter = LanguageInterpreter.link(
                new ZentariCharacterInterpreter()
        );
    }

    @Override
    public String encode(String message) {
        return interpreter.encode(message);
    }

    @Override
    public String decode(String message) {
        return interpreter.decode(message);
    }
}
