package com.sectionheaderrecyclerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerViewId)
    RecyclerView recyclerView;

    private HeaderRecyclerViewSection firstSection, secondSection, thirdSection;
    private SectionedRecyclerViewAdapter sectionedRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        firstSection = new HeaderRecyclerViewSection("First", getItemListContent());
        secondSection = new HeaderRecyclerViewSection("Second", getItemListContent());
        thirdSection = new HeaderRecyclerViewSection("Third", getItemListContent());

        sectionedRecyclerViewAdapter = new SectionedRecyclerViewAdapter();
        sectionedRecyclerViewAdapter.addSection(firstSection);
        sectionedRecyclerViewAdapter.addSection(secondSection);
        sectionedRecyclerViewAdapter.addSection(thirdSection);

        recyclerView.setAdapter(sectionedRecyclerViewAdapter);

    }

    private List<ItemObject> getItemListContent() {
        List<ItemObject> itemObjects = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            itemObjects.add(new ItemObject("Section item: " + (i + 1)));
        }
        return itemObjects;
    }
}
