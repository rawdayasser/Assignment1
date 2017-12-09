package fci.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recyclerview);


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

        TaskRecyclerViewAdapter adapter = new TaskRecyclerViewAdapter(items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
