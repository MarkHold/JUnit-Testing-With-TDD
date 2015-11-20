package MainTestPackage;


/**
 * Created by Markus on 19/11/15.
 */

import Model.MuscleGain;
import org.junit.Test;

import static org.junit.Assert.*;


public class MuscleGainTestingClass {


    @Test
    public void testWeightValidation() throws Exception {
        try {
            MuscleGain gainz = new MuscleGain();
            int w = -879;
            gainz.setWeight(w);
            fail();
        } catch (IllegalArgumentException e) {

        }

    }

    @Test
    public void testHeightValidation() throws Exception {
        try {
            MuscleGain gainz = new MuscleGain();
            int h = -175;
            gainz.setHeight(h);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void setAgeValidation() throws Exception
    {
        try{
            MuscleGain gainz = new MuscleGain();
            int a = -213;
            gainz.setAge(a);
            fail();
        }
        catch(IllegalArgumentException e){

        }
    }

    @Test
    public void testCalorieValidation()
    {

        int weight = 70;
        int height = 180;
        int age = 20;

        MuscleGain gain = new MuscleGain();

        assertEquals(2330.0, gain.countKcal(weight, height, age), 0.5);

    }

    @Test
    public void testProtein() {

        double kcal = 2330.0;

        MuscleGain gain = new MuscleGain();

        assertEquals(233.0, gain.countProtein(kcal), 1.0);
    }

    @Test
    public void testCarbs()
    {
        double kcal = 2330.0;

        MuscleGain gain = new MuscleGain();


        assertEquals(291, gain.countCarb(kcal), 0.75);
    }

    @Test
    public void testFats()
    {
        double kcal = 2330.0;

        MuscleGain gain = new MuscleGain();

        assertEquals(26, gain.countFat(kcal), 0.75);
    }



}

