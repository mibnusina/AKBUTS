package com.mbi.akbuts.ui.notifications;
//Muhammad Ibnu Sina
//10117279
//IF8
//Tanggal Pengerjaan=09-05-2020
public class DaftarTeman {
    private String nim;
    private String nama;
    private String kelas;
    private String telp;
    private String email;
    private String sosmed;

    public DaftarTeman(String nim, String nama, String kelas, String telp, String email, String sosmed) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.telp = telp;
        this.email = email;
        this.sosmed = sosmed;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getTelp() {
        return telp;
    }

    public String getEmail() {
        return email;
    }

    public String getSosmed() {
        return sosmed;
    }
}
