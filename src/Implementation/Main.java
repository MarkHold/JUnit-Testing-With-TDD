package Implementation;

/**
 * Created by Markus on 10/11/15.
 */
public class Main {

    private int weight;

    private int height;

    private int age;

    private int bmr;

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
        if(a <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.age = a;
    }

    public double countCalories(int vikt, int height, int age){

        double kcal = 10 * vikt + 6.25 * height - 5 * age + 5;

        if (kcal <= 5) {
            throw new IllegalArgumentException();
        }
        return kcal;
    }

    public int countProtein(int vikt){
        int protein = vikt*10;

        return protein;

    }

    }
