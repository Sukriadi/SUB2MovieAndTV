package com.example.sub2movieandtv.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sub2movieandtv.Adapter.ListMovieAdapter;
import com.example.sub2movieandtv.Adapter.ListTVAdapter;
import com.example.sub2movieandtv.Movie;
import com.example.sub2movieandtv.MoviesData;
import com.example.sub2movieandtv.R;
import com.example.sub2movieandtv.TV;
import com.example.sub2movieandtv.TVData;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TVFragment extends Fragment {
    private RecyclerView rvTV;
    private ArrayList<TV> list = new ArrayList<>();
    public TVFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tv,container,false);
        rvTV = view.findViewById(R.id.rv_tv);
        rvTV.setHasFixedSize(true);
        list.addAll(TVData.getListData());
        showRecyclerListTV();

        return view;

    }


    private void showRecyclerListTV(){
        rvTV.setLayoutManager(new GridLayoutManager(getContext(),1));
        ListTVAdapter listTVAdapter = new ListTVAdapter(this.getContext());
        listTVAdapter.setListTv(list);
        rvTV.setAdapter(listTVAdapter);

    }


}
