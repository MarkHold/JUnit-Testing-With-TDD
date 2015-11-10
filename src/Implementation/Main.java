package Implementation;

/**
 * Created by Markus on 10/11/15.
 */
public class Main {

    private int weight;

    private int height;

    private int age;
    public void setWeight(int w) {

        if(w <= 0) {
            throw new IllegalArgumentException();
        }
        this.weight = w;
    }

    public void setHeight(int h) {

        if (h <= 0) {
            throw new IllegalArgumentException();
        }
        this.height = h;
    }

    public void setAge(int a)
    {

    }
}
