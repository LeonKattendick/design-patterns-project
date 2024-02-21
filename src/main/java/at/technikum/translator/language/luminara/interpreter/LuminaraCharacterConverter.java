package at.technikum.translator.language.luminara.interpreter;

import at.technikum.translator.language.LanguageConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LuminaraCharacterConverter extends LanguageConverter {

    private static final Map<String, String> ENCODE_MAP = new HashMap<>();
    private static Map<String, String> DECODE_MAP;

    static {
        ENCODE_MAP.put("a", "α");
        ENCODE_MAP.put("A", "Α");
        ENCODE_MAP.put("b", "β");
        ENCODE_MAP.put("B", "Β");
        ENCODE_MAP.put("c", "χ");
        ENCODE_MAP.put("C", "Χ");
        ENCODE_MAP.put("d", "δ");
        ENCODE_MAP.put("D", "Δ");
        ENCODE_MAP.put("e", "ε");
        ENCODE_MAP.put("E", "Ε");
        ENCODE_MAP.put("f", "ψ");
        ENCODE_MAP.put("F", "Ψ");
        ENCODE_MAP.put("g", "ω");
        ENCODE_MAP.put("G", "Ω");
        ENCODE_MAP.put("h", "η");
        ENCODE_MAP.put("H", "Η");
        ENCODE_MAP.put("i", "ι");
        ENCODE_MAP.put("I", "Ι");
        ENCODE_MAP.put("j", "j");
        ENCODE_MAP.put("J", "J");
        ENCODE_MAP.put("k", "κ");
        ENCODE_MAP.put("K", "Κ");
        ENCODE_MAP.put("l", "λ");
        ENCODE_MAP.put("L", "Λ");
        ENCODE_MAP.put("m", "μ");
        ENCODE_MAP.put("M", "Μ");
        ENCODE_MAP.put("n", "ν");
        ENCODE_MAP.put("N", "Ν");
        ENCODE_MAP.put("o", "θ");
        ENCODE_MAP.put("O", "Θ");
        ENCODE_MAP.put("p", "ρ");
        ENCODE_MAP.put("P", "Ρ");
        ENCODE_MAP.put("q", "q");
        ENCODE_MAP.put("Q", "Q");
        ENCODE_MAP.put("r", "σ");
        ENCODE_MAP.put("R", "Σ");
        ENCODE_MAP.put("s", "ς");
        ENCODE_MAP.put("S", "S");
        ENCODE_MAP.put("t", "τ");
        ENCODE_MAP.put("T", "Τ");
        ENCODE_MAP.put("u", "φ");
        ENCODE_MAP.put("U", "Φ");
        ENCODE_MAP.put("v", "v");
        ENCODE_MAP.put("V", "V");
        ENCODE_MAP.put("w", "π");
        ENCODE_MAP.put("W", "Π");
        ENCODE_MAP.put("x", "ξ");
        ENCODE_MAP.put("X", "Ξ");
        ENCODE_MAP.put("y", "γ");
        ENCODE_MAP.put("Y", "Γ");
        ENCODE_MAP.put("z", "ζ");
        ENCODE_MAP.put("Z", "Ζ");

        DECODE_MAP = ENCODE_MAP.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    @Override
    protected String encodeCurrent(String message) {
        for (Map.Entry<String, String> entry : ENCODE_MAP.entrySet()) {
            message = message.replace(entry.getKey(), entry.getValue());
        }
        return message;
    }

    @Override
    protected String decodeCurrent(String message) {
        for (Map.Entry<String, String> entry : DECODE_MAP.entrySet()) {
            message = message.replace(entry.getKey(), entry.getValue());
        }
        return message;
    }
}
