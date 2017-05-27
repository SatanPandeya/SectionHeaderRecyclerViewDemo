package com.sectionheaderrecyclerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wolfmatrix on 5/27/17.
 */

public class ItemViewHolderClass extends RecyclerView.ViewHolder {
    @BindView(R.id.itemContentId)
    TextView item;
    public ItemViewHolderClass(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
