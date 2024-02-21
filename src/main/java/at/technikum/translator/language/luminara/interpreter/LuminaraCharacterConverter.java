package at.technikum.translator.language.luminara.interpreter;

import at.technikum.translator.language.LanguageConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LuminaraCharacterConverter extends LanguageConverter {

    private static Map<String, String> encodeMap = new HashMap<>();
    private static Map<String, String> decodeMap;

    static {
        encodeMap.put("a", "α");
        encodeMap.put("A", "Α");
        encodeMap.put("b", "β");
        encodeMap.put("B", "Β");
        encodeMap.put("c", "χ");
        encodeMap.put("C", "Χ");
        encodeMap.put("d", "δ");
        encodeMap.put("D", "Δ");
        encodeMap.put("e", "ε");
        encodeMap.put("E", "Ε");
        encodeMap.put("f", "ψ");
        encodeMap.put("F", "Ψ");
        encodeMap.put("g", "ω");
        encodeMap.put("G", "Ω");
        encodeMap.put("h", "η");
        encodeMap.put("H", "Η");
        encodeMap.put("i", "ι");
        encodeMap.put("I", "Ι");
        encodeMap.put("j", "j");
        encodeMap.put("J", "J");
        encodeMap.put("k", "κ");
        encodeMap.put("K", "Κ");
        encodeMap.put("l", "λ");
        encodeMap.put("L", "Λ");
        encodeMap.put("m", "μ");
        encodeMap.put("M", "Μ");
        encodeMap.put("n", "ν");
        encodeMap.put("N", "Ν");
        encodeMap.put("o", "θ");
        encodeMap.put("O", "Θ");
        encodeMap.put("p", "ρ");
        encodeMap.put("P", "Ρ");
        encodeMap.put("q", "q");
        encodeMap.put("Q", "Q");
        encodeMap.put("r", "σ");
        encodeMap.put("R", "Σ");
        encodeMap.put("s", "ς");
        encodeMap.put("S", "S");
        encodeMap.put("t", "τ");
        encodeMap.put("T", "Τ");
        encodeMap.put("u", "φ");
        encodeMap.put("U", "Φ");
        encodeMap.put("v", "v");
        encodeMap.put("V", "V");
        encodeMap.put("w", "π");
        encodeMap.put("W", "Π");
        encodeMap.put("x", "ξ");
        encodeMap.put("X", "Ξ");
        encodeMap.put("y", "γ");
        encodeMap.put("Y", "Γ");
        encodeMap.put("z", "ζ");
        encodeMap.put("Z", "Ζ");

        decodeMap = encodeMap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    @Override
    protected String encodeCurrent(String message) {
        for (Map.Entry<String, String> entry : encodeMap.entrySet()) {
            message = message.replace(entry.getKey(), entry.getValue());
        }
        return message;
    }

    @Override
    protected String decodeCurrent(String message) {
        for (Map.Entry<String, String> entry : decodeMap.entrySet()) {
            message = message.replace(entry.getKey(), entry.getValue());
        }
        return message;
    }
}
