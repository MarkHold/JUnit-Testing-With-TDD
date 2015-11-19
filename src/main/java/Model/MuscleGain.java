package Model;

/**
 * Created by Markus on 19/11/15.
 */
public class MuscleGain {

    private int weight;

    private int height;



    /*A method to take the weight in and check if its valid*/
    public void setWeight(int w)
    {

        if(w <= 0) {
            throw new IllegalArgumentException();
        }

        this.weight = w;
    }
    public void setHeight(int h){

        if(h <= 0){
            throw new IllegalArgumentException();
        }

        this.height = h;
    }
    public void setAge(int a){

    }

}
