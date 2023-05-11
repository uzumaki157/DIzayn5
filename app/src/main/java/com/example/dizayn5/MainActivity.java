package com.example.dizayn5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dizayn5.Adapters.RecentAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecy;
    RecentAdapter adapter;
    List<ArticleModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setlist();
        adapter = new RecentAdapter(list);
        recentRecy.setAdapter(adapter);
    }

    private void setlist() {
            list = new ArrayList<>();
            list.add(new ArticleModel(R.drawable.img,"Top 10 beatiful girls in Asia ","Sara", "1 week ago"));
        list.add(new ArticleModel(R.drawable.img2,"Top 10 beatiful girls in Asia ","Sara", "1 week ago"));
        list.add(new ArticleModel(R.drawable.img3,"Top 10 beatiful girls in Asia ","Sara", "1 week ago"));
        list.add(new ArticleModel(R.drawable.img4,"Top 10 beatiful girls in Asia ","Sara", "1 week ago"));
        list.add(new ArticleModel(R.drawable.img5,"Top 10 beatiful girls in Asia ","Sara", "1 week ago"));
    }

    private void initViews() {
        recentRecy=findViewById(R.id.recentRecy);
    }
}