package at.technikum.translator.language.luminara;

import at.technikum.translator.language.LanguageInterpreter;
import at.technikum.translator.language.TranslationStrategy;
import at.technikum.translator.language.luminara.interpreter.LuminaraCharacterInterpreter;

public class LuminaraStrategy implements TranslationStrategy {

    private final LanguageInterpreter interpreter;

    public LuminaraStrategy() {
        this.interpreter = LanguageInterpreter.link(
                new LuminaraCharacterInterpreter()
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
