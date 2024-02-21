package at.technikum.translator.language.luminara;

import at.technikum.translator.language.LanguageIdentifier;
import at.technikum.translator.util.AlienLanguage;

public class LuminaraLanguageIdentifier extends LanguageIdentifier {

    @Override
    protected AlienLanguage identifyCurrent(String message) {
        return AlienLanguage.LUMINARA;
    }
}
