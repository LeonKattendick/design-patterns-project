package at.technikum.translator.language.luminara;

import at.technikum.translator.language.LanguageConverter;
import at.technikum.translator.language.TranslationStrategy;
import at.technikum.translator.language.luminara.interpreter.LuminaraCaesarCipherConverter;
import at.technikum.translator.language.luminara.interpreter.LuminaraCharacterConverter;

public class LuminaraStrategy implements TranslationStrategy {

    private final LanguageConverter encodeConverter;

    private final LanguageConverter decodeConverter;

    public LuminaraStrategy() {
        this.encodeConverter = LanguageConverter.link(
                new LuminaraCaesarCipherConverter(),
                new LuminaraCharacterConverter()
        );
        this.decodeConverter = LanguageConverter.link(
                new LuminaraCharacterConverter(),
                new LuminaraCaesarCipherConverter()
        );
    }

    @Override
    public String encode(String message) {
        return encodeConverter.encode(message);
    }

    @Override
    public String decode(String message) {
        return decodeConverter.decode(message);
    }
}
