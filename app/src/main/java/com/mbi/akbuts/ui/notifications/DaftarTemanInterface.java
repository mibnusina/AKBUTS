package com.mbi.akbuts.ui.notifications;
//Muhammad Ibnu Sina
//10117279
//IF8
//Tanggal Pengerjaan=09-05-2020
import android.database.Cursor;

public interface DaftarTemanInterface {
    public Cursor read();
    public boolean create(DaftarTeman daftarTeman);
    public boolean update(DaftarTeman daftarTeman);
    public boolean delete(String nim);
}
