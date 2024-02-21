package at.technikum.translator.language;

public interface TranslationStrategy {

    String encode(String message);

    String decode(String message);

}
