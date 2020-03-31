package com.asutosh.mvvmsample.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.asutosh.mvvmsample.R;
import com.asutosh.mvvmsample.view.adapter.RecyclerAdapter;
import com.asutosh.mvvmsample.model.NicePlacePojo;
import com.asutosh.mvvmsample.viewmodel.NicePlaceViewModel;

import java.util.List;

/**
 * This your View
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerAdapter mAdapter;
    private ProgressBar mProgressBar;
    private NicePlaceViewModel mMainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineViews();
        getViewModel();
        initViewModel();
    }

    private void defineViews() {
        mRecyclerView = findViewById(R.id.recycler_view);
        mProgressBar = findViewById(R.id.progress_bar);
    }

    private void initViewModel() {

        /**
         * Observing the LiveData that is inside the ViewModel
         */
        mMainActivityViewModel.getNicePlaces().observe(this, new Observer<List<NicePlacePojo>>() {
            @Override
            public void onChanged(@Nullable List<NicePlacePojo> nicePlaces) {
                if(nicePlaces != null){
                    initRecyclerView(nicePlaces);
                }
            }
        });

        mMainActivityViewModel.getImageData();

    }

    /**
     * create ViewModel instance
     */
    private void getViewModel() {
        mMainActivityViewModel = ViewModelProviders.of(this).get(NicePlaceViewModel.class);
    }

    private void initRecyclerView(List<NicePlacePojo> nicePlaces){
        mAdapter = new RecyclerAdapter(this, nicePlaces);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void showProgressBar(){
        mProgressBar.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar(){
        mProgressBar.setVisibility(View.GONE);
    }
}




















