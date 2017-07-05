package com.example.user.myfavouritetrees;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class FavouriteTreesAdapter extends ArrayAdapter<Tree> {

    public FavouriteTreesAdapter(Context context, ArrayList<Tree> trees) {
        super(context, 0, trees);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.trees_item, parent, false);
        }

        Tree currentTree = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentTree.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentTree.getName());

        TextView age = (TextView) listItemView.findViewById(R.id.age);
        age.setText(currentTree.getAge().toString());

        listItemView.setTag(currentTree);

        return listItemView;
    }

}
