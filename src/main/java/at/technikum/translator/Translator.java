package at.technikum.translator;

import at.technikum.translator.util.AlienLanguage;

public class Translator {

    public static void main(String[] args) {

        String s1 = TranslationFacade.getInstance().encodeMessage("Das ist ein yoller Test!", AlienLanguage.ZENTARI);
        System.out.println(s1);

        String s2 = TranslationFacade.getInstance().encodeMessage("Das ist ein yoller Test!", AlienLanguage.LUMINARA);
        System.out.println(s2);

    }
}
