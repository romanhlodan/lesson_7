package ua.com.hrv;

public abstract class Paner {

    private int Length;
    private int Width;
    private int Weight;


    public void setLength(int length) {
        Length = length;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public abstract int engineStart();

    public abstract double distance();

    public abstract void planeLanding();
}
