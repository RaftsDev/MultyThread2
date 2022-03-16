package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=1; i<=5; i++){
            Multythreading thing = new Multythreading(i);
            Thread myThread = new Thread(thing);
            myThread.start();
            System.out.println(myThread.getId());
        }


    }
}
