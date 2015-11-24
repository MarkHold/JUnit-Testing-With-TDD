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
        gain.setWeight(n);

       getHeightFromUser(new PracticalView(System.in, System.out));
    }

    public static int getBoundIntegerFromUser(PracticalView asker) {
        int input = asker.ask("Hello and welcome, please Enter your weight!");
        while (input < 0 || input > 200)

            input = asker.ask("that is an invalid number, please try agian!");
        return input;
    }

    public static int getHeightFromUser(PracticalView height) {
        int input = height.ask("Now its time to enter your height!");
        while (input < 0 || input > 250)

            input = height.ask("that is an invalid number, please try again!");
        return input;

    }


}
