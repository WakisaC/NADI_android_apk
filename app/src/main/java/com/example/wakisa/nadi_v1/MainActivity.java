package com.example.wakisa.nadi_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    EditText edoedema,edweight,edheight,edwasting,edmuac;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }


    public  void getStarted(View view){
       general();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            home();
        } else if (id == R.id.nav_choose) {
            choose();

        } else if (id == R.id.nav_progress) {
            database();

        } else if (id == R.id.nav_feedback) {
            feedbackl();

        } else if (id == R.id.nav_notes) {
            notes();

        } else if (id == R.id.nav_About) {
            about();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    // functions to handle activity change

    public void home(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void choose(){
        Intent intent= new Intent(this,choose.class);
        startActivity(intent);
    }
    public void general(){
        Intent intent = new Intent(this,general.class);
        startActivity(intent);
    }

    public void database(){
        Intent intent = new Intent(this,Database.class);
        startActivity(intent);
    }

    public void about(){
        Intent intent = new Intent(this,About.class);
        startActivity(intent);
    }
    public void feedbackl(){
        Intent intent = new Intent(this,Feedback.class);
        startActivity(intent);
    }
    public void graph(){
        Intent intent = new Intent(this,graph.class);
        startActivity(intent);
    }
    public void notes(){
        Intent intent = new Intent(this,NoteMain.class);
        startActivity(intent);
    }
}
