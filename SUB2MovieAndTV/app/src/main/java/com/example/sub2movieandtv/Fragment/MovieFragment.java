package com.example.sub2movieandtv.Fragment;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.sub2movieandtv.Adapter.ListMovieAdapter;
import com.example.sub2movieandtv.Movie;
import com.example.sub2movieandtv.MoviesData;
import com.example.sub2movieandtv.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {
    private RecyclerView rvMovies;
    private ArrayList<Movie> list=new ArrayList<>();

    public MovieFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie,container,false);
        rvMovies = view.findViewById(R.id.rv_movie);
        rvMovies.setHasFixedSize(true);

        list.addAll(MoviesData.getListData());
        showRecyclerListMovie();
        return view;
    }

    private void showRecyclerListMovie(){
        rvMovies.setLayoutManager(new GridLayoutManager(getContext(),1));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(this.getContext());
        listMovieAdapter.setListMovie(list);
        rvMovies.setAdapter(listMovieAdapter);

    }


}
