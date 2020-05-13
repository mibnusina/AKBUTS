package com.mbi.akbuts.ui.home;
//Muhammad Ibnu Sina
//10117279
//IF8
//Tanggal Pengerjaan=09-05-2020
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Muhammad Ibnu Sina");
    }

    public LiveData<String> getText() {
        return mText;
    }
}