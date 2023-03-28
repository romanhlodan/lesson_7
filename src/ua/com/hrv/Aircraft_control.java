package ua.com.hrv;

public class Aircraft_control {

    private int up;
    private int down;
    private int left;
    private int right;

    public void setUp(int up) {
        this.up = up;
    }

    public void setDown(int down) {
        this.down = down;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

     int up(){
        return (int) (Math.random()* 1000+1);
    }
    int down(){
        return (int) (Math.random()*1000+1);
    }
    int left(){
        return (int) (Math.random()*1000+1);
    }
    int right(){
        return (int) (Math.random()*1000+1);
    }

}
