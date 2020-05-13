package com.mbi.akbuts.ui.notifications;
//Muhammad Ibnu Sina
//10117279
//IF8
//Tanggal Pengerjaan=09-05-2020
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.mbi.akbuts.R;

import java.util.List;

public class DaftarTemanAdapter extends RecyclerView.Adapter<DaftarTemanAdapter.DaftarTemanViewHolder> {
    private List<DaftarTeman> temanList;

    public DaftarTemanAdapter(List<DaftarTeman> temanList) {
        this.temanList = temanList;
    }

    @NonNull
    @Override
    public DaftarTemanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.items,null,false);
        return new DaftarTemanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DaftarTemanViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return temanList.size();
    }

    public class DaftarTemanViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNim,tvNama,tvKelas,tvTelp,tvEmail,tvSosmed;

        public DaftarTemanViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNim = itemView.findViewById(R.id.tvNim);
            tvNama= itemView.findViewById(R.id.tvNama);
            tvKelas = itemView.findViewById(R.id.tvKelas);
            tvTelp = itemView.findViewById(R.id.tvTelp);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvSosmed = itemView.findViewById(R.id.tvSosmed);
        }
    }
}
