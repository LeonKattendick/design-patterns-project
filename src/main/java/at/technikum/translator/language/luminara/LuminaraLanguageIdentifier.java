package at.technikum.translator.language.luminara;

import at.technikum.translator.language.LanguageIdentifier;
import at.technikum.translator.util.AlienLanguage;

import java.util.ArrayList;
import java.util.List;

public class LuminaraLanguageIdentifier extends LanguageIdentifier {

    private static final List<Character> LUMINARA_UNIQUE_CHARS = new ArrayList<>();

    static {
        LUMINARA_UNIQUE_CHARS.add('α');
        LUMINARA_UNIQUE_CHARS.add('β');
        LUMINARA_UNIQUE_CHARS.add('γ');
        LUMINARA_UNIQUE_CHARS.add('Γ');
        LUMINARA_UNIQUE_CHARS.add('Δ');
        LUMINARA_UNIQUE_CHARS.add('δ');
        LUMINARA_UNIQUE_CHARS.add('ε');
        LUMINARA_UNIQUE_CHARS.add('ζ');
        LUMINARA_UNIQUE_CHARS.add('η');
        LUMINARA_UNIQUE_CHARS.add('Θ');
        LUMINARA_UNIQUE_CHARS.add('θ');
        LUMINARA_UNIQUE_CHARS.add('ι');
        LUMINARA_UNIQUE_CHARS.add('κ');
        LUMINARA_UNIQUE_CHARS.add('Λ');
        LUMINARA_UNIQUE_CHARS.add('λ');
        LUMINARA_UNIQUE_CHARS.add('μ');
        LUMINARA_UNIQUE_CHARS.add('ν');
        LUMINARA_UNIQUE_CHARS.add('Ξ');
        LUMINARA_UNIQUE_CHARS.add('ξ');
        LUMINARA_UNIQUE_CHARS.add('Π');
        LUMINARA_UNIQUE_CHARS.add('π');
        LUMINARA_UNIQUE_CHARS.add('ρ');
        LUMINARA_UNIQUE_CHARS.add('σ');
        LUMINARA_UNIQUE_CHARS.add('ς');
        LUMINARA_UNIQUE_CHARS.add('Σ');
        LUMINARA_UNIQUE_CHARS.add('τ');
        LUMINARA_UNIQUE_CHARS.add('υ');
        LUMINARA_UNIQUE_CHARS.add('Φ');
        LUMINARA_UNIQUE_CHARS.add('φ');
        LUMINARA_UNIQUE_CHARS.add('χ');
        LUMINARA_UNIQUE_CHARS.add('Ψ');
        LUMINARA_UNIQUE_CHARS.add('ψ');
        LUMINARA_UNIQUE_CHARS.add('Ω');
        LUMINARA_UNIQUE_CHARS.add('ω');
    }

    @Override
    protected AlienLanguage identifyCurrent(String message) {
        for (char c : message.toCharArray()) {
            if (LUMINARA_UNIQUE_CHARS.contains(c)) return AlienLanguage.LUMINARA;
        }
        return null;
    }
}
