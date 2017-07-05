package com.example.user.myfavouritetrees;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class FavouriteTreesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trees_list);

        FavouriteTrees favouriteTrees = new FavouriteTrees();
        ArrayList<Tree> list = favouriteTrees.getList();

        FavouriteTreesAdapter treeAdapter = new FavouriteTreesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(treeAdapter);
    }

    public void getTree(View listItem){
        Tree tree = (Tree) listItem.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("Your tree is");
        sb.append(tree.getName());

    }

}