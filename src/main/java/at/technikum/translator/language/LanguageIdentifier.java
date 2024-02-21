package at.technikum.translator.language;

import at.technikum.translator.util.AlienLanguage;

public abstract class LanguageIdentifier {

    private LanguageIdentifier next;

    public static LanguageIdentifier link(LanguageIdentifier first, LanguageIdentifier... chain) {
        LanguageIdentifier head = first;
        for (LanguageIdentifier nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    protected abstract AlienLanguage identifyCurrent(String message);

    public AlienLanguage identify(String message) {
        AlienLanguage check = identifyCurrent(message);
        if (check != null) {
            return check;
        }
        if (next == null) {
            throw new UnsupportedOperationException("Language not found.");
        }
        return next.identify(message);
    }
}
