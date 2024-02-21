package at.technikum.translator.language.zentari.interpreter;

import at.technikum.translator.language.LanguageConverter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ZentariCharacterConverter extends LanguageConverter {

    public static final Map<String, String> ALPHABET_MAP_ENCODED;
    public static final Map<String, String> ALPHABET_MAP_DECODED;

    static {
        Map<String, String> aMap = new HashMap<>();
        aMap.put("A", "≙/");
        aMap.put("B", "≙∦");
        aMap.put("C", "≙±");
        aMap.put("D", "≙⟂");
        aMap.put("E", "≙ẍ");
        aMap.put("F", "≙∢");
        aMap.put("G", "≙∅");
        aMap.put("H", "≙⇎");
        aMap.put("I", "≙?");
        aMap.put("J", "≙∰");
        aMap.put("K", "≙∵");
        aMap.put("L", "≙∴");
        aMap.put("M", "≙≬");
        aMap.put("N", "≙∎");
        aMap.put("O", "≙⊆");
        aMap.put("P", "≙⊊");
        aMap.put("Q", "≙≲");
        aMap.put("R", "≙⋙");
        aMap.put("S", "≙⋘");
        aMap.put("T", "≙∱");
        aMap.put("U", "≙Q");
        aMap.put("V", "≙∳");
        aMap.put("W", "≙∀");
        aMap.put("X", "≙∞");
        aMap.put("Y", "≙↦");
        aMap.put("Z", "≙+");
        aMap.put("Ä", "≙≠");
        aMap.put("Ö", "≙≇");
        aMap.put("Ü", "≙≢");

        aMap.put("a", "⊽/");
        aMap.put("b", "⊽∦");
        aMap.put("c", "⊽±");
        aMap.put("d", "⊽⟂");
        aMap.put("e", "⊽ẍ");
        aMap.put("f", "⊽∢");
        aMap.put("g", "⊽∅");
        aMap.put("h", "⊽⇎");
        aMap.put("i", "⊽?");
        aMap.put("j", "⊽∰");
        aMap.put("k", "⊽∵");
        aMap.put("l", "⊽∴");
        aMap.put("m", "⊽≬");
        aMap.put("n", "⊽∎");
        aMap.put("o", "⊽⊆");
        aMap.put("p", "⊽⊊");
        aMap.put("q", "⊽≲");
        aMap.put("r", "⊽⋙");
        aMap.put("s", "⊽⋘");
        aMap.put("t", "⊽∱");
        aMap.put("u", "⊽q");
        aMap.put("v", "⊽∳");
        aMap.put("w", "⊽∀");
        aMap.put("x", "⊽∞");
        aMap.put("y", "⊽↦");
        aMap.put("z", "⊽+");
        aMap.put("ä", "⊽≠");
        aMap.put("ö", "⊽≇");
        aMap.put("ü", "⊽≢");

        aMap.put("ß", "⊽⋅");
        aMap.put(".", "..");
        aMap.put("?", "??");
        aMap.put("!", "!!");

        ALPHABET_MAP_ENCODED = Collections.unmodifiableMap(aMap);
        ALPHABET_MAP_DECODED = aMap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }


    @Override
    protected String encodeCurrent(String message) {

        for (Map.Entry<String, String> entry : ALPHABET_MAP_ENCODED.entrySet()) {
            message = message.replace(entry.getKey(), entry.getValue());
        }
        return message;
    }

    @Override
    protected String decodeCurrent(String message) {

        for (Map.Entry<String, String> entry : ALPHABET_MAP_DECODED.entrySet()) {
            message = message.replace(entry.getKey(), entry.getValue());
        }
        return message;

    }
}
