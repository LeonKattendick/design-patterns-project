package at.technikum.translator.language;

public abstract class LanguageConverter {

    private LanguageConverter next;

    public static LanguageConverter link(LanguageConverter first, LanguageConverter... chain) {
        LanguageConverter head = first;
        for (LanguageConverter nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    protected abstract String encodeCurrent(String message);

    protected abstract String decodeCurrent(String message);

    public String encode(String message) {
        String encoded = encodeCurrent(message);
        if (next == null) {
            return encoded;
        }
        return next.encode(encoded);
    }

    public String decode(String message) {
        String decoded = decodeCurrent(message);
        if (next == null) {
            return decoded;
        }
        return next.decode(decoded);
    }
}
