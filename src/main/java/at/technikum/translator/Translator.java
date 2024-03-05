package at.technikum.translator;

import at.technikum.translator.util.AlienLanguage;

import java.util.Arrays;
import java.util.Scanner;

public class Translator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please select your option (Encode/Decode): ");
            String input = scanner.nextLine().toLowerCase();

            if ("encode".contains(input)) {
                System.out.println("Please enter the language, that should be translated (Zentari/Luminara): ");
                input = scanner.nextLine().toLowerCase();

                String finalInput = input;
                AlienLanguage language = Arrays.stream(AlienLanguage.values())
                        .filter(v -> v.name().toLowerCase().contains(finalInput))
                        .findFirst()
                        .orElse(null);

                if (language != null) {
                    System.out.println("Please enter the text: ");
                    input = scanner.nextLine();
                    System.out.println("... Translating result ...");

                    String decoded = TranslationFacade.getInstance().encodeMessage(input, language);
                    System.out.println();
                    System.out.println("Result: " + decoded);
                    System.out.println();
                }
            } else if ("decode".contains(input)) {
                System.out.println("Please enter the text: ");
                input = scanner.nextLine();
                System.out.println("... Translating result ...");

                try {
                    String decoded = TranslationFacade.getInstance().decodeMessage(input);
                    System.out.println();
                    System.out.println("Result: " + decoded);
                    System.out.println();
                } catch (UnsupportedOperationException e) {
                    System.out.println("The original language could not be identified.");
                }
            } else {
                break;
            }
        }
        System.out.println("... Translator stopped ...");
        scanner.close();
    }
}
