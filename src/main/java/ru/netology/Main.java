package ru.netology;

public class Main {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("treadgroup");
        MyThread myThread1 = new MyThread(tg, "поток 1");
        MyThread myThread2 = new MyThread(tg, "поток 2");
        MyThread myThread3 = new MyThread(tg, "поток 3");
        MyThread myThread4 = new MyThread(tg, "поток 4");

        myThread1.start();
        myThread2.start();
        myThread4.start();
        myThread3.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tg.interrupt();
    }
}
