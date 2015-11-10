package Implementation;

/**
 * Created by Markus on 10/11/15.
 */
public class Main {

    private int weight;

    public void setWeight(int w) {

        if(weight <= 0) {
            throw new IllegalArgumentException();
        }
        this.weight = w;
    }
}
