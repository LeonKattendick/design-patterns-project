package at.technikum.translator.language.zentari;

import at.technikum.translator.language.LanguageConverter;
import at.technikum.translator.language.TranslationStrategy;
import at.technikum.translator.language.zentari.interpreter.ZentariCharacterConverter;

public class ZentariStrategy implements TranslationStrategy {

    private final LanguageConverter converter;

    public ZentariStrategy() {
        this.converter = LanguageConverter.link(
                new ZentariCharacterConverter()
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
