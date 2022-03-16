package com.company;

public class Multythreading implements Runnable{
    private int threadNum;

    Multythreading(int threadNum){
        this.threadNum = threadNum;
    }

    public void run(){
        for(int i=1; i<=5;i++){
            System.out.printf("Thread number: %d counter: %d\n",threadNum,i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
    }
}
