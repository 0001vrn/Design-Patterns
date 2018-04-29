package com.pluralsight.singleton;

public class SingletonEveryDayDemo {
    public static void main(String[] args){
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println("singletonRuntime = " + singletonRuntime);
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println("anotherInstance = " + anotherInstance);
        if (singletonRuntime == anotherInstance)
            System.out.println("They are same");

    }
}
