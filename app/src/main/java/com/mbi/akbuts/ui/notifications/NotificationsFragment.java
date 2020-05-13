package com.mbi.akbuts.ui.notifications;
//Muhammad Ibnu Sina
//10117279
//IF8
//Tanggal Pengerjaan=09-05-2020
import android.app.Notification;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mbi.akbuts.InputActivity;
import com.mbi.akbuts.R;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {

    private RecyclerView rv_teman;
    private NotificationsViewModel notificationsViewModel;
    private List<DaftarTeman> temanList;
    private DaftarTemanInterface temanInterface;
    private DaftarTemanAdapter temanAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                init();
            }
        });
//        init();
        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        read();
    }

    private void init() {
        rv_teman = (RecyclerView) getView().findViewById(R.id.rv_teman);
        rv_teman.setLayoutManager(new LinearLayoutManager(getContext()));

        getView().findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), InputActivity.class);
                startActivity(intent);
            }
        });
    }

    private void read(){
        temanList = new ArrayList<>();
        temanInterface = new DaftarTemanImp(getContext());

        Cursor cursor= temanInterface.read();
        if(cursor.moveToFirst()){
            do{
                DaftarTeman daftarTeman = new DaftarTeman(
                        cursor.getString(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5)
                );
                temanList.add(daftarTeman);
            }while (cursor.moveToNext());
        }


//        temanAdapter = new DaftarTemanAdapter((List<DaftarTeman>) this); //tes
//        rv_teman.setAdapter(temanAdapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        read();
    }

    //    public void onClick(int position){
//        temanList.get(position);//belum
//    }
}