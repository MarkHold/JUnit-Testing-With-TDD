package View;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Markus on 17/11/15.
 */
public class PracticalView {


    private final Scanner scanner;
    private final PrintStream out;

    public PracticalView(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
    }

    public int ask(String message) {
        out.println(message);
        return scanner.nextInt();
    }
}


