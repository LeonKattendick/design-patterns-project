package at.technikum.translator.language.luminara.interpreter;

import at.technikum.translator.language.LanguageConverter;

public class LuminaraCaesarCipherConverter extends LanguageConverter {

    private static final int OFFSET = 3;

    @Override
    protected String encodeCurrent(String message) {
        return cipher(message, OFFSET);
    }

    @Override
    protected String decodeCurrent(String message) {
        return cipher(message, 26 - (OFFSET % 26));
    }

    private String cipher(String message, int offset) {
        char[] chars = new char[message.length()];

        for (int i = 0; i < message.toCharArray().length; i++) {
            char charAt = message.charAt(i);
            if (charAt != ' ') {
                char startChar = charAt >= 'a' ? 'a' : 'A';
                int deltaPos = charAt - startChar;
                int newPos = (deltaPos + offset) % 26;
                chars[i] = (char) (startChar + newPos);
            } else {
                chars[i] = ' ';
            }
        }
        return new String(chars);
    }
}
