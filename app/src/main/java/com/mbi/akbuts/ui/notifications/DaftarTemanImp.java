package com.mbi.akbuts.ui.notifications;
//Muhammad Ibnu Sina
//10117279
//IF8
//Tanggal Pengerjaan=09-05-2020
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DaftarTemanImp extends SQLiteOpenHelper implements DaftarTemanInterface {
    public DaftarTemanImp(Context context){
        super(context, "db_teman",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sql) {
        sql.execSQL("CREATE TABLE tbl_teman (nim TEXT, nama TEXT, kelas TEXT, telp TEXT, email TEXT, " +
                "sosmed TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sql, int i, int i1) {
        sql.execSQL("DROP TABLE tbl_teman");
    }
    @Override
    public Cursor read() {
        SQLiteDatabase sql = getReadableDatabase();
        return sql.rawQuery("SELECT * FROM tbl_teman", null);
    }

    @Override
    public boolean create(DaftarTeman daftarTeman) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("INSERT INTO tbl_teman VALUES ('"+daftarTeman.getNim()+"','"+daftarTeman.getNama()+
                "','"+daftarTeman.getKelas()+"','"+daftarTeman.getTelp()+"','"+daftarTeman.getEmail()+"','"
                +daftarTeman.getSosmed()+"'");
        return true;
    }

    @Override
    public boolean update(DaftarTeman daftarTeman) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("UPDATE tbl_teman SET nim='"+daftarTeman.getNim()+"',nama='"+daftarTeman.getNama()+
                "',kelas='"+daftarTeman.getKelas()+"',telp='"+daftarTeman.getTelp()+"',email='"+
                daftarTeman.getEmail()+"',sosmed='"+daftarTeman.getSosmed()+"'");
        return true;
    }

    @Override
    public boolean delete(String nim) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("DELETE FROM tbl_teman WHERE nim='"+nim+"'");
        return true;
    }


}
