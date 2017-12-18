package com.example.alexgalan.mynavdrawer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        //Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

            if (id == 1) {
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();

        }
        if (mToggle.onOptionsItemSelected(item)) {
          //  return true;

            Toast.makeText(this, "Other", Toast.LENGTH_SHORT).show();

            }
        return super.onOptionsItemSelected(item);
}
}
