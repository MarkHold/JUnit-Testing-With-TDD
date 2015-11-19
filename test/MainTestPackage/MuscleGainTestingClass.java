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
            int w = -5;
            gainz.setWeight(w);
            fail();
        }
        catch(IllegalArgumentException e){

            }

        }

    }

