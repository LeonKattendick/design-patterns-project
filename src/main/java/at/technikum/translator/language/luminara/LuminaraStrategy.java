package at.technikum.translator.language.luminara;

import at.technikum.translator.language.LanguageConverter;
import at.technikum.translator.language.TranslationStrategy;
import at.technikum.translator.language.luminara.interpreter.LuminaraCharacterConverter;

public class LuminaraStrategy implements TranslationStrategy {

    private final LanguageConverter converter;

    public LuminaraStrategy() {
        this.converter = LanguageConverter.link(
                new LuminaraCharacterConverter()
        );
    }

    @Override
    public String encode(String message) {
        return converter.encode(message);
    }

    @Override
    public String decode(String message) {
        return converter.decode(message);
    }
}
