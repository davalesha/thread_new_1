package ru.netology;

class MyThread extends Thread {

    public MyThread(ThreadGroup tg, String name) {
        super(tg, name);
    }


    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Всем привет! Я" + Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {
            interrupt();
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
