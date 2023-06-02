package com.example.ex9_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

//    create an options menu
    public  boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public  boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.message){
            Toast.makeText(this, "You clicked Message menu", Toast.LENGTH_SHORT).show();
            return true;
        }else if (item.getItemId()==R.id.picture){
            Toast.makeText(this, "You clicked Picture menu", Toast.LENGTH_SHORT).show();
            return true;
        }else if (item.getItemId()==R.id.mode){
            Toast.makeText(this, "You clicked Mode menu", Toast.LENGTH_SHORT).show();
            return true;
        }else if (item.getItemId()==R.id.option_favorites1){
            Toast.makeText(this, "You clicked Book menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId()==R.id.option_favorites2) {
            Toast.makeText(this, "You clicked About menu", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId()==R.id.exit) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}