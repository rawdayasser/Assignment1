package fci.assignment1;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listView = findViewById(R.id.listview);
        ArrayList<TaskItemData> items = new ArrayList<>();
        items.add(new TaskItemData("tas1", R.drawable.circle_1));
        items.add(new TaskItemData("tas3", R.drawable.circle_2));
        items.add(new TaskItemData("tas4", R.drawable.circle_2));
        items.add(new TaskItemData("tas4561", R.drawable.circle_1));
        items.add(new TaskItemData("tas562", R.drawable.circle_1));
        items.add(new TaskItemData("ta4s41", R.drawable.circle_1));
        items.add(new TaskItemData("tas445656", R.drawable.circle_2));
        items.add(new TaskItemData("tas1", R.drawable.circle_2));
        items.add(new TaskItemData("tasd", R.drawable.circle_2));
        items.add(new TaskItemData("tas4561456", R.drawable.circle_1));
        items.add(new TaskItemData("tas1", R.drawable.circle_2));
        items.add(new TaskItemData("ta465s3", R.drawable.circle_2));
        items.add(new TaskItemData("tas4561", R.drawable.circle_1));
        items.add(new TaskItemData("tas464", R.drawable.circle_1));
        items.add(new TaskItemData("tas1", R.drawable.circle_1));

        TasksListAdapter adapter = new TasksListAdapter(items, getLayoutInflater());
        listView.setAdapter(adapter);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.setting) {
            // Handle the camera action
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
