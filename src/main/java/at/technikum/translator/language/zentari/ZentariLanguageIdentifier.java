package at.technikum.translator.language.zentari;

import at.technikum.translator.language.LanguageIdentifier;
import at.technikum.translator.language.zentari.interpreter.ZentariCharacterConverter;
import at.technikum.translator.util.AlienLanguage;

import java.util.Map;

public class ZentariLanguageIdentifier extends LanguageIdentifier {

    @Override
    protected AlienLanguage identifyCurrent(String message) {

        String alienMessage = message.replace(" ", "");
        for (int i = 0; i < alienMessage.length(); i += 2) {
            String alienPair = alienMessage.substring(i, i + 2);
            if (!ZentariCharacterConverter.ALPHABET_MAP_DECODED.containsKey(alienPair)) {
                return null;
            }
        }
        return AlienLanguage.ZENTARI;
    }
}
