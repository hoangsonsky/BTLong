package com.example.hoangson.btlong;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class BlankFragment extends Fragment {

    RecyclerView mRecyclerView;
    RecycleAdapter adapter;
    ArrayList<Entity> mArrayList = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fakeData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_blank, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        adapter = new RecycleAdapter(mArrayList, getActivity());
        mRecyclerView.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(llm);

        return view;
    }

    private void fakeData(){
        Entity entity = new Entity();
        entity.setText("img0");
        entity.setImg(android.R.drawable.ic_input_add);
        mArrayList.add(entity);

        Entity entity1 = new Entity();
        entity1.setText("img1");
        entity1.setImg(android.R.drawable.ic_delete);
        mArrayList.add(entity1);

        Entity entity2 = new Entity();
        entity2.setText("img2");
        entity2.setImg(android.R.drawable.menu_frame);
        mArrayList.add(entity2);
    }
}
