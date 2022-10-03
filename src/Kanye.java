import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;

public class Kanye {
    public static void main(String[] args) throws IOException {
        System.setProperty("http.agent", "Netscape 1.0");
        URL kanyePage = new URL("https://api.kanye.rest/text");
        StringBuffer stringBuffer;
        Scanner scanner;
        String choice;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Kanye West goes to his Kanye Nest to take a Kanye Rest. He wakes up feeling his Kanye Best.\nnext - give me a quote!\nexit - no more kanye thx");
        do {
            choice = keyboard.nextLine().toLowerCase(Locale.ROOT);
            if (choice.matches("exit"))
                break;
            if (choice.equals("next")) {
                stringBuffer = new StringBuffer();
                scanner = new Scanner(kanyePage.openStream());
                while (scanner.hasNext())
                    stringBuffer.append(scanner.nextLine());
                System.out.println(stringBuffer);
            } else {
                System.out.println("You have to choose something...");
            }
        } while (!choice.equals("exit"));
        System.out.println("Can we get much higher?");
    }
}
