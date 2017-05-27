package com.sectionheaderrecyclerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wolfmatrix on 5/27/17.
 */

public class HeaderViewHolderClass extends RecyclerView.ViewHolder {
    @BindView(R.id.headerId)
    TextView header;
    public HeaderViewHolderClass(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
