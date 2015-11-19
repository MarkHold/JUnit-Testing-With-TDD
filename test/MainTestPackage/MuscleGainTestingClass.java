package MainTestPackage;


/**
 * Created by Markus on 19/11/15.
 */

import Model.MuscleGain;
import org.junit.Test;

import static org.junit.Assert.*;


public class MuscleGainTestingClass {



    @Test
    public void testWeightValidation() throws Exception{
        try {
            MuscleGain gainz = new MuscleGain();
            int w = -879;
            gainz.setWeight(w);
            fail();
        }
        catch(IllegalArgumentException e){

            }

        }

    @Test
    public void testHeightValidation() throws Exception
    {
            try{
                MuscleGain gainz = new MuscleGain();
                int h = -175;
                gainz.setHeight(h);
                fail();
            }
            catch(IllegalArgumentException e){

            }
    }

    }

