package com.example.peter.coptic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter on 30/09/2017.
 */

public class Adapter extends ArrayAdapter{

    private Context mContext;
    private List<Integer> images = new ArrayList<>();

    public Adapter(Context mContext,List<Integer>images){
        super(mContext,R.layout.single_letter,R.id.letterImage,images);
        this.mContext=mContext;
        this.images=images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridItem = convertView;
        if(gridItem == null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridItem = inflater.inflate(R.layout.single_letter,parent,false);
        }
        ImageView mImageView = (ImageView) gridItem.findViewById(R.id.letterImage);
//    mImageView.setLayoutParams(new GridView.LayoutParams(500, 780));
//        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//        mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        mImageView.setImageResource(images.get(position));

        return gridItem;
    }

}
