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
    public void testBmrValidation(){

        int vikt = 70;
        int height = 180;
        int age = 20;
        int bmr = 0;

        try {
            Main main = new Main();
            main.countCalories(vikt, height, age, bmr);
            fail();
        }
        catch(IllegalArgumentException e){

        }


    }

}
