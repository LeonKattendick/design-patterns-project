package at.technikum.translator;

import at.technikum.translator.language.LanguageIdentifier;
import at.technikum.translator.language.zentari.ZentariLanguageIdentifier;
import at.technikum.translator.language.luminara.LuminaraLanguageIdentifier;
import at.technikum.translator.language.zentari.ZentariStrategy;
import at.technikum.translator.language.luminara.LuminaraStrategy;
import at.technikum.translator.language.TranslationStrategy;
import at.technikum.translator.util.AlienLanguage;

public class TranslationFacade {

    private static TranslationFacade instance;

    public String encodeMessage(String message, AlienLanguage language) {
        TranslationStrategy strategy = getTranslationStrategy(language);
        return strategy.encode(message);
    }

    public String decodeMessage(String message) {

        LanguageIdentifier identifier = LanguageIdentifier.link(
                new LuminaraLanguageIdentifier(),
                new ZentariLanguageIdentifier()
        );

        AlienLanguage language = identifier.identify(message);
        TranslationStrategy strategy = getTranslationStrategy(language);

        return strategy.decode(message);
    }

    private static TranslationStrategy getTranslationStrategy(AlienLanguage language) {
        TranslationStrategy strategy;
        switch (language) {
            case ZENTARI -> strategy = new ZentariStrategy();
            case LUMINARA -> strategy = new LuminaraStrategy();
            default -> throw new UnsupportedOperationException("Not supported");
        }
        return strategy;
    }

    public static TranslationFacade getInstance() {
        if (instance == null) instance = new TranslationFacade();
        return instance;
    }
}
