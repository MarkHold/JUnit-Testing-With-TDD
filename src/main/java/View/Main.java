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

       int h = getHeightFromUser(new PracticalView(System.in, System.out));
        loss.setHeight(h);
        gain.setHeight(h);

        int a = getAgeFromUser(new PracticalView(System.in, System.out));
        loss.setAge(a);
        gain.setAge(a);
    }

    public static int getBoundIntegerFromUser(PracticalView asker) {
        int input = asker.ask("Hello and welcome, please Enter your weight!");
        while (input < 0 || input > 200)

            input = asker.ask("that is an invalid number, please try agian!");
        return input;
    }

    public static int getHeightFromUser(PracticalView height) {
        int HeightInput = height.ask("Now its time to enter your height!");
        while (HeightInput < 0 || HeightInput > 250)

            HeightInput = height.ask("that is an invalid number, please try again!");
        return HeightInput;

    }

    public static int getAgeFromUser(PracticalView age) {
        int AgeInput = age.ask("We are almost done! Now please enter your age");
        while (AgeInput < 0 || AgeInput > 250)

            AgeInput = age.ask("that is an invalid number, please try again!");
        return AgeInput;
    }

    public static int getAppFromUser(PracticalView app) {
        int appInput = app.ask("Now its time to choose. If you want the macros for Fatloss, please enter the number 1, if you want the macros for muscle gain, please enter the number 2");

        while (appInput < 0 || appInput > 3)

            appInput = app.ask("that is an invalid number, please try again!");
        return appInput;

    }




}
