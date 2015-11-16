package MainTestPackage;

import Implementation.Main;
import com.sun.media.sound.InvalidDataException;
import junit.framework.TestCase;

import org.junit.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 * Created by Markus on 10/11/15.
 */
public class MainTestingClass extends TestCase {


    @Test
    public void testCheckingForClass() throws Exception {

        Main main = new Main();
        assertNotNull(main);
    }

    @Test
    public void testCheckingIfWeightIsValid(){

        try {
            Main main = new Main();
        main.setWeight(-5);
        fail();
        }
        catch(IllegalArgumentException e){

        }
    }

    @Test
    public void testCheckingIfHeightIsValid() {


        try {
            Main main = new Main();
            main.setHeight(-5);
            fail();
        } catch (IllegalArgumentException e){

        }
    }

    @Test
    public void testCheckIfAgeIsValid() {

        try {
            Main main = new Main ();
            main.setAge(-2);
            fail();
        }
        catch(IllegalArgumentException e){

        }
    }


    @Test
    public void testCountCalories(){
        int vikt = 70;
        int height = 180;
        int age = 20;
        Main main = new Main();


        assertEquals(1730.0, main.countCalories(vikt, height, age));

    }

    @Test
    public void testCountCountCalories2(){

        try{
            Main main = new Main();
            main.countCalories(0, 0, 0);
            fail();

        }
        catch(IllegalArgumentException e){}
    }

    @Test
    public void testProteinCounterCheck()// a test method for counting protein intake
    {
        int vikt = 50;
        Main main = new Main();

        assertEquals(500, main.countProtein(vikt));
    }

    @Test
    public void testCarbCounter()
    {
        double kcal = 2000;

        Main main = new Main();

        assertEquals(250.0, main.countCarbs(kcal));
    }

    @Test
    public void testFatCounter()
    {
        double kcal = 2001;

        Main main = new Main();

        assertEquals(44.46666666666667, main.countFats(kcal));
    }
}
