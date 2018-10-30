package com.example.md.recyclerviewwithdatabinding;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerViewPerson = findViewById(R.id.recycler_view_person);
        recyclerViewPerson.setHasFixedSize(true);
        recyclerViewPerson.setLayoutManager(new LinearLayoutManager(this));
        PersonAdapter adapter = new PersonAdapter();
        recyclerViewPerson.setAdapter(adapter);
        initialization();
        adapter.setPersonList(personList);
        
    }

    private void initialization() {
        personList.add(new Person("Mainuddin", 20));
        personList.add(new Person("Dadon", 21));
        personList.add(new Person("Riaz", 19));
        personList.add(new Person("Lutfor", 21));
        personList.add(new Person("Ashik", 20));
        personList.add(new Person("Kamal", 22));
        personList.add(new Person("Robi", 18));
    }
}
