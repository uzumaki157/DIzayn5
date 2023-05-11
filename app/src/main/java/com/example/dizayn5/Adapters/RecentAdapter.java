package com.example.dizayn5.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dizayn5.ArticleModel;
import com.example.dizayn5.DetailsActivity;
import com.example.dizayn5.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.MainViewHolder> {

    List<ArticleModel> list;

    public RecentAdapter(List<ArticleModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postitem,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.author.setText(list.get(position).getAuthor());
        holder.title.setText(list.get(position).getTitle());
        holder.day.setText(list.get(position).getDay());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
       return list.size();
    }



    public class MainViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView image;
        TextView title,author,day;
        public MainViewHolder(@NonNull View itemView) {

            super(itemView);
            image = itemView.findViewById(R.id.shapeableImageView);
            title = itemView.findViewById(R.id.textView);
             author = itemView.findViewById(R.id.textView2);
            day = itemView.findViewById(R.id.textView3);
        }
    }
}
