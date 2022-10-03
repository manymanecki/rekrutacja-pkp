import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;

public class Kanye {
    public static void main(String[] args) throws IOException {
        System.setProperty("http.agent", "Netscape 1.0");

        URL kanyePage = new URL("https://api.kanye.rest/text");
        InputStreamReader reader = new InputStreamReader(kanyePage.openStream());
        String quote = reader.toString();
        System.out.println(quote);

        String choice;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Kanye West goes to his Kanye Nest to take a Kanye Rest. He wakes up feeling his Kanye Best.\nnext - give me a quote!\nexit - no more kanye thx");
        do {
            choice = keyboard.nextLine().toLowerCase(Locale.ROOT);
            if (choice.matches("exit"))
                break;
            if (choice.equals("next")) {
                System.out.println("here we should have kanyes quote");
            } else {
                System.out.println("noooo you have to choose something");
            }
        } while (!choice.equals("exit"));
        System.out.println("can we get much higher?");
    }
}
