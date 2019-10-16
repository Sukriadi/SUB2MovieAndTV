package com.example.sub2movieandtv.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.sub2movieandtv.Movie;
import com.example.sub2movieandtv.R;
import com.example.sub2movieandtv.TV;
import com.example.sub2movieandtv.TVDetail;

import java.util.ArrayList;

public class ListTVAdapter extends RecyclerView.Adapter<ListTVAdapter.ListTvViewHolder> {
    private Context context;
    private ArrayList <TV> listTv;

    public ListTVAdapter(Context context) {this.context = context;   }

    public ArrayList<TV> getListTv() {
        return listTv;
    }

    public void setListTv(ArrayList<TV> listTv) {this.listTv = listTv;   }

    @NonNull
    @Override
    public ListTvViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_tv,viewGroup,false);
        return new ListTvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListTvViewHolder listTvViewHolder, int position) {
        TV tv = getListTv().get(position);
        Glide.with(context)
                .load(tv.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(listTvViewHolder.imgPhoto);

        listTvViewHolder.tvTitle.setText(tv.getTitle());
        listTvViewHolder.tvDateReleased.setText(tv.getDate_released());
        listTvViewHolder.tvUserScore.setText(tv.getUser_score());
        listTvViewHolder.tvRuntime.setText(tv.getRuntime());

    }

    @Override
    public int getItemCount() {
        return getListTv().size();
    }


    class ListTvViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvTitle, tvRuntime, tvDateReleased, tvUserScore;

        ListTvViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            tvDateReleased = itemView.findViewById(R.id.tv_item_dateReleased);
            tvUserScore = itemView.findViewById(R.id.tv_item_score);
            tvRuntime = itemView.findViewById(R.id.tv_item_runtime);

            itemView.setOnClickListener(this);
        }


        public void onClick(View v) {
            int position = getAdapterPosition();
            TV tvShow = getListTv().get(position);

            tvShow.setTitle(tvShow.getTitle());
            tvShow.setOverview(tvShow.getOverview());

            Intent moveWithObjectIntent = new Intent(itemView.getContext(), TVDetail.class);
            moveWithObjectIntent.putExtra(TVDetail.EXTRA_TV, tvShow);
            context.startActivity(moveWithObjectIntent);
        }

    }
}
