package at.technikum.translator.language.luminara.interpreter;

import at.technikum.translator.language.LanguageConverter;

public class LuminaraCaesarCipherConverter extends LanguageConverter {

    private static final int OFFSET = 3;

    @Override
    protected String encodeCurrent(String message) {
        char[] chars = new char[message.length()];

        for (int i = 0; i < message.toCharArray().length; i++) {
            int deltaPos = message.charAt(i) - 'a';
            int newPos = (deltaPos + OFFSET) % 26;
            chars[i] = (char) ('a' + newPos);
        }
        return new String(chars);
    }

    @Override
    protected String decodeCurrent(String message) {
        char[] chars = new char[message.length()];

        for (int i = 0; i < message.toCharArray().length; i++) {
            int deltaPos = message.charAt(i) - 'a';
            int newPos = (deltaPos - OFFSET + 26) % 26;
            chars[i] = (char) ('a' + newPos);
        }
        return new String(chars);
    }
}
