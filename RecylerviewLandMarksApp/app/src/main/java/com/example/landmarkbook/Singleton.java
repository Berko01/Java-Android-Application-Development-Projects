package com.example.landmarkbook;

public class Singleton {

    private Landmark sentLandMark;
    private static Singleton singleton;

    private Singleton(){

    }

    public Landmark getSentLandmark(){
        return sentLandMark;
    }

    public void setSentLandmark(Landmark sentLandMark){
        this.sentLandMark = sentLandMark;
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
