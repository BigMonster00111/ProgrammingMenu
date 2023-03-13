package com.thakur.programmingmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id=item.getItemId();
        if (item_id==R.id.android){
            Toast.makeText(this, "THIS IS ANDROID OPTION", Toast.LENGTH_SHORT).show();
        }
        else if (item_id==R.id.profile){
            Toast.makeText(this, "THIS IS PROFILE OPTION", Toast.LENGTH_SHORT).show();
        }
        else if (item_id==R.id.download){
            Toast.makeText(this, "THIS IS DOWNLOAD OPTION", Toast.LENGTH_SHORT).show();
        }
        else if (item_id==R.id.settings){
            Toast.makeText(this, "THIS IS SETTINGS OPTION", Toast.LENGTH_SHORT).show();
        }
        else if (item_id==R.id.logout){
            Toast.makeText(this, "THIS IS LOGOUT OPTION", Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}