package com.example.customlistview1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    //a List of type hero for holding list items
    List<Hero> heroList;

    //the listview
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);
        //adding some values to our list
        heroList.add(new Hero(R.drawable.aku, "Spiderman", "Avengers"));
        heroList.add(new Hero(R.drawable.im, "Joker", "Injustice Gang"));
                heroList.add(new Hero(R.drawable.jendaya, "Iron Man", "Avengers"));
        heroList.add(new Hero(R.drawable.mj, "Doctor Strange", "Avengers"));
                heroList.add(new Hero(R.drawable.saya, "Captain America", "Avengers"));
                        heroList.add(new Hero(R.drawable.aku, "Batman", "Justice League"));
                                //creating the adapter
                                MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);
    }
}

