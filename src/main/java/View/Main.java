package View;

import Model.FatLoss;
import Model.MuscleGain;

/**
 * Created by Markus on 23/11/15.
 */
public class Main {
    public static void main(String[] args) {
        FatLoss loss = new FatLoss();
        MuscleGain gain = new MuscleGain();
        int n = getBoundIntegerFromUser(new PracticalView(System.in, System.out));
        loss.setWeight(n);
    }

    public static int getBoundIntegerFromUser(PracticalView asker) {
        int input = asker.ask("Hello and welcome, please Enter your weight!");
        while (input < 0 || input > 200)

            input = asker.ask("that is an invalid number, please try agian!");
        return input;
    }
}
