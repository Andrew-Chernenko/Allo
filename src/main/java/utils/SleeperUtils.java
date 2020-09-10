package utils;

public class SleeperUtils {
    public static void threadSleep(int sleepTime) throws InterruptedException {
        sleepTime = sleepTime * 1000;
        Thread.sleep(sleepTime);
    }

}
