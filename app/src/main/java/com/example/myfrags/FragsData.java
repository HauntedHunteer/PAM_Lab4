package com.example.myfrags;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragsData extends ViewModel {
    private final MutableLiveData<Integer> counter = new MutableLiveData<>(0);

    public MutableLiveData<Integer> getCounter() {
        return counter;
    }
}
