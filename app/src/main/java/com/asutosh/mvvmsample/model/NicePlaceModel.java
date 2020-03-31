package com.asutosh.mvvmsample.model;

import java.util.ArrayList;

/**
 * This is your Model that deals with Data
 */

public class NicePlaceModel {

    private static NicePlaceModel instance;
    private ArrayList<NicePlacePojo> dataSet = new ArrayList<>();

    public static NicePlaceModel getInstance(){
        if(instance == null){
            instance = new NicePlaceModel();
        }
        return instance;
    }

    public ArrayList<NicePlacePojo> getNicePlaces(){
        dataSet.add(
                new NicePlacePojo("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg",
                        "Havasu Falls")
        );
        dataSet.add(
                new NicePlacePojo("https://i.redd.it/tpsnoz5bzo501.jpg",
                        "Trondheim")
        );
        dataSet.add(
                new NicePlacePojo("https://i.redd.it/qn7f9oqu7o501.jpg",
                        "Portugal")
        );
        dataSet.add(
                new NicePlacePojo("https://i.redd.it/j6myfqglup501.jpg",
                        "Rocky Mountain National Park")
        );
        dataSet.add(
                new NicePlacePojo("https://i.redd.it/0h2gm1ix6p501.jpg",
                        "Havasu Falls")
        );
        dataSet.add(
                new NicePlacePojo("https://i.redd.it/k98uzl68eh501.jpg",
                        "Mahahual")
        );
        dataSet.add(
                new NicePlacePojo("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg",
                        "Frozen Lake")
        );
        dataSet.add(
                new NicePlacePojo("https://i.redd.it/obx4zydshg601.jpg",
                        "Austrailia")
        );
        return dataSet;
    }
}











