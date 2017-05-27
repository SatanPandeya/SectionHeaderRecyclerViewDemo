package com.sectionheaderrecyclerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import io.github.luizgrp.sectionedrecyclerviewadapter.StatelessSection;

/**
 * Created by wolfmatrix on 5/27/17.
 */

public class HeaderRecyclerViewSection extends StatelessSection {
    private String title;
    private List<ItemObject> itemObjectList = new ArrayList<>();

    public HeaderRecyclerViewSection(String title, List<ItemObject> itemObjectList) {
        super(R.layout.layout_header, R.layout.layout_item);
        this.title = title;
        this.itemObjectList = itemObjectList;
    }

    @Override
    public int getContentItemsTotal() {
        return itemObjectList.size();
    }

    @Override
    public RecyclerView.ViewHolder getItemViewHolder(View view) {
        return new ItemViewHolderClass(view);
    }

    @Override
    public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemObject itemObject = itemObjectList.get(position);
        ItemViewHolderClass viewHolderClass = (ItemViewHolderClass) holder;
        viewHolderClass.item.setText(itemObject.getName());
    }

    @Override
    public RecyclerView.ViewHolder getHeaderViewHolder(View view) {
        return new HeaderViewHolderClass(view);
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder) {
        HeaderViewHolderClass headerViewHolderClass = (HeaderViewHolderClass) holder;
        headerViewHolderClass.header.setText(title);
    }
}
