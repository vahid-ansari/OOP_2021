package view;

public class Timing {

    private static int currentTime;

    private int date;

    public Timing() { this.date =Timing.currentTime; }

    public static void goForward(){ Timing.currentTime++; }

    public int getDate(){ return this.date; }

    public static int getCurrentTime() { return currentTime; }
}
