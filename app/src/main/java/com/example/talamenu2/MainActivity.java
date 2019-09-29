package com.example.talamenu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {/// benaa al dali MENU
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.talasmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {/// moalajet hadath l ikhtiar item mn al kaeme.
        if(item.getItemId()==R.id.itmScreen1)
        {
            Intent intent=new Intent(this,ActivityScreen1.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.itmScreen2)
        {
            Intent intent=new Intent(this,ActivityScreen2.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.itmynet3)
        {
            Toast.makeText(this,"ynet",Toast.LENGTH_SHORT).show();
        }
        return true;

    }
}
