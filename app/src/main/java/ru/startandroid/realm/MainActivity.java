package ru.startandroid.realm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        final String[] numbers = new String[] {


              "Name","Surname", "Button"

        };
        // Create adapter to set value for grid view
        ArrayAdapter<String> adapterGrid = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, numbers);

        gridView.setAdapter(adapterGrid);
*/

        List<Users> usersList = new ArrayList<>();
        Users users = new Users("Novak", "Djokovic");
        Users users1 = new Users("Rogernobolk", "Fed");
        Users users2 = new Users("Andy", "Murraylkkjlkjl");
        Users users3 = new Users("David", "Ferrer");
        usersList.add(users);
        usersList.add(users1);
        usersList.add(users2);
        usersList.add(users3);


        rvMain = (RecyclerView) findViewById(R.id.rv_main);
        Adapter adapter = new Adapter(usersList);
        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext());

        RecyclerView.LayoutManager manager =
                new GridLayoutManager(getApplicationContext(), 1);
        rvMain.setLayoutManager(manager);
        rvMain.setItemAnimator(new DefaultItemAnimator());
        rvMain.setAdapter(adapter);

    }
}
