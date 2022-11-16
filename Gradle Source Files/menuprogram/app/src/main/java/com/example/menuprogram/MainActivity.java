package com.example.menuprogram;

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
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Toast.makeText(this,"Selected item: "+item.getTitle(),Toast.LENGTH_SHORT).show();
        switch (item.getItemId())
        {
            case R.id.search_item:
                Toast.makeText(this,"Clicked search item",Toast.LENGTH_LONG).show();
                return true;
            case R.id.upload_item:
                return true;
            case R.id.print_item:
                return true;
            case R.id.share_item:
                return true;
            case R.id.bookmark_item:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}