package com.mbi.akbuts.ui.notifications;
//Muhammad Ibnu Sina
//10117279
//IF8
//Tanggal Pengerjaan=09-05-2020
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

public class NotificationsViewModel extends ViewModel {
    private RecyclerView rv_teman;
    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}