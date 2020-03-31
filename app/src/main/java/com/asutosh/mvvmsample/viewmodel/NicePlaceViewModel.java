package com.asutosh.mvvmsample.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.asutosh.mvvmsample.model.NicePlacePojo;
import com.asutosh.mvvmsample.model.NicePlaceModel;

import java.util.ArrayList;
import java.util.List;

/**
 * This your ViewModel that handles Business logic and also connects to the Model
 */

public class NicePlaceViewModel extends ViewModel {

    private MutableLiveData<List<NicePlacePojo>> mNicePlaces = new MutableLiveData<>();
    private NicePlaceModel mModel;

    public void getImageData(){
        mModel = NicePlaceModel.getInstance();

        /**
         * get the data from the Model
         */
        ArrayList<NicePlacePojo> nicePlaces = mModel.getNicePlaces();

        /**
         * Post the data back to the View that is observing for this data
         */
        mNicePlaces.postValue(nicePlaces);
    }

    public LiveData<List<NicePlacePojo>> getNicePlaces(){
        return mNicePlaces;
    }

}
