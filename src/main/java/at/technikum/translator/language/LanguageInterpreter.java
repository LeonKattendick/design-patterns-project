package at.technikum.translator.language;

public abstract class LanguageInterpreter {

    private LanguageInterpreter next;

    public static LanguageInterpreter link(LanguageInterpreter first, LanguageInterpreter... chain) {
        LanguageInterpreter head = first;
        for (LanguageInterpreter nextInChain : chain) {
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
