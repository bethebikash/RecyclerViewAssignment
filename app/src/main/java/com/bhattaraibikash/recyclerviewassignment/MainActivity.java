package com.bhattaraibikash.recyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMailList = findViewById(R.id.rvMailList);

        List<MailList> mailLists = new ArrayList<>();
        mailLists.add(new MailList("Hello dude!", "Hi, I am Someone writing this message.", "04:21", R.drawable.personone));
        mailLists.add(new MailList("My Assignment", "I have uploaded my assignment in the GitHub.", "06:10", R.drawable.persontwo));
        mailLists.add(new MailList("The Problem", "Hello Sir, I am facing problem in recycler view.", "02:43", R.drawable.personthree));
        mailLists.add(new MailList("Sample title", "And this is the sample message", "04:21", R.drawable.personfour));

        MailListAdapter mailListAdapter = new MailListAdapter(this, mailLists);
        rvMailList.setAdapter(mailListAdapter);
        rvMailList.setLayoutManager(new LinearLayoutManager(this));
    }
}
