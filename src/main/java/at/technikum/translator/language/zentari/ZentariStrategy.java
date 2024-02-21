package at.technikum.translator.language.zentari;

import at.technikum.translator.language.LanguageConverter;
import at.technikum.translator.language.TranslationStrategy;
import at.technikum.translator.language.zentari.interpreter.ZentariCharacterConverter;

public class ZentariStrategy implements TranslationStrategy {

    private final LanguageConverter encodeConverter;
    private final LanguageConverter decodeconverter;

    public ZentariStrategy() {
        this.encodeConverter = LanguageConverter.link(
                new ZentariCharacterConverter()
        );

        this.decodeconverter = LanguageConverter.link(
                new ZentariCharacterConverter()
        );
    }

    @Override
    public String encode(String message) {
        return encodeConverter.encode(message);
    }

    @Override
    public String decode(String message) {
        return decodeconverter.decode(message);
    }
}
