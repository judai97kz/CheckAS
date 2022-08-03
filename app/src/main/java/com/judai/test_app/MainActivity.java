package com.judai.test_app;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lsau;
    ArrayList<Aus> arrayList;
    AuAdapter adapter;

    String DB_NAME = "Aus.sqlite";
    private String DB_PATH = "/databases/";

    SQLiteDatabase database=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        XulysaocheptuAssets();
        AnhXa();
        showData();
    }

    private void showData() {
        database = openOrCreateDatabase(DB_NAME,MODE_PRIVATE,null);
        Cursor cursor=database.query("Aus",null,null,null,null,null,null);
        arrayList = new ArrayList<>();

        while (cursor.moveToNext()){
            try {
                String _star = cursor.getString(0);
                String _name = cursor.getString(1);
                String _class = cursor.getString(2);
                String _ele1 = cursor.getString(3);
                String _ele2 = cursor.getString(4);
                Bitmap _ava = BitmapFactory.decodeByteArray(cursor.getBlob(5), 0, cursor.getBlob(5).length);
                String _sk1 = cursor.getString(6);
                String _sk2 = cursor.getString(7);
                String _sk3 = cursor.getString(8);
                Bitmap _isk1 = BitmapFactory.decodeByteArray(cursor.getBlob(9), 0, cursor.getBlob(9).length);
                Bitmap _isk2 = BitmapFactory.decodeByteArray(cursor.getBlob(10), 0, cursor.getBlob(10).length);
                Bitmap _isk3 = BitmapFactory.decodeByteArray(cursor.getBlob(11), 0, cursor.getBlob(11).length);
                String _info = cursor.getString(12);
                Aus a1 = new Aus(_star, _name, _class, _ele1, _ele2, _ava, _sk1, _sk2, _sk3, _isk1, _isk2, _isk3, _info);
                arrayList.add(a1);
            }catch (Exception e){
                Log.e("Lỗi đây",e.toString());
            }
        }
        cursor.close();
        adapter.notifyDataSetChanged();
    }

    private void XulysaocheptuAssets() {
        File dbfile =getDatabasePath(DB_NAME);
        if(!dbfile.exists()){
            copyDatabase();
        }else{
            dbfile.delete();
            copyDatabase();
        }
    }

    private void copyDatabase() {
        try{
            InputStream myInput = getAssets().open(DB_NAME);
            String outFileName = getApplicationInfo().dataDir+DB_PATH+DB_NAME;
            File f = new File(getApplicationInfo().dataDir+DB_PATH);
            if(!f.mkdir()){
                f.mkdir();
            }
            OutputStream myOutPut = new FileOutputStream(outFileName);
            byte[] buffer = new byte[1024];
            int len;
            while((len=myInput.read(buffer))>0){
                myOutPut.write(buffer,0,len);
            }
            myOutPut.flush();
            myInput.close();
            myOutPut.close();
        }catch (Exception e){
            e.printStackTrace();
            Log.e("Lỗi sao chép",e.toString());
        }
    }


    private void AnhXa() {
        lsau = findViewById(R.id.ls);
        adapter = new AuAdapter(this,arrayList,R.layout.au_row);
        lsau.setAdapter(adapter);
    }
}