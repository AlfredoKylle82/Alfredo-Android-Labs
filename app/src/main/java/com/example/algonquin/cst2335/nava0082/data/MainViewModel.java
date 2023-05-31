package com.example.algonquin.cst2335.nava0082.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MutableLiveData<String> editString = new MutableLiveData<>();
    public MutableLiveData<Boolean> isSelected = new MutableLiveData<>();
    public void onChanged(String s){

    }

    public void setIsSelected(Boolean value) {
        isSelected.postValue(value);
    }

    public MutableLiveData<Boolean> getIsSelected() {
        return isSelected;
    }

}
