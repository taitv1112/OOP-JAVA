package ClassAndContructorInJava;

import java.util.Arrays;

public class StopWatch {
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }


    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }


    ////thoi gian troi tinh bang mili giay
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }


    //thoi gian troi tinh bang giayy
    public long getElapsedTimeSecs() {
        long elapsed;
        if (running) {
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        } else {
            elapsed = ((stopTime - startTime) / 1000);
        }
        return elapsed;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int sum =0;
        int[]arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) Math.floor(Math.random()*100)+1;
        }
        System.out.println(Arrays.toString(arr));
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
