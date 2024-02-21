package at.technikum.translator;

import at.technikum.translator.util.AlienLanguage;

import java.util.Arrays;
import java.util.Scanner;

public class Translator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Geben Sie eine Aktion ein (Encode/Decode): ");
            String input = scanner.nextLine().toLowerCase();

            if ("encode".contains(input)) {
                System.out.println("Geben Sie die Sprache an, in welche übersetzt werden soll (Zentari/Luminara): ");
                input = scanner.nextLine().toLowerCase();

                String finalInput = input;
                AlienLanguage language = Arrays.stream(AlienLanguage.values())
                        .filter(v -> v.name().toLowerCase().contains(finalInput))
                        .findFirst()
                        .orElse(null);

                if (language != null) {
                    System.out.println("Geben Sie den zu übersetzenden Text ein: ");
                    input = scanner.nextLine();
                    System.out.println("... Übersetze Ergebnis ...");

                    String decoded = TranslationFacade.getInstance().encodeMessage(input, language);
                    System.out.println();
                    System.out.println("Resultat: " + decoded);
                    System.out.println();
                }
            } else if ("decode".contains(input)) {
                System.out.println("Geben Sie den zu übersetzenden Text ein: ");
                input = scanner.nextLine();
                System.out.println("... Übersetze Ergebnis ...");

                String decoded = TranslationFacade.getInstance().decodeMessage(input);
                System.out.println("Resultat: " + decoded);
            } else {
                break;
            }
        }
        System.out.println("... Translator beendet ...");
        scanner.close();
    }
}
