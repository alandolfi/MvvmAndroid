package com.ar.mvvmpattern;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ar.mvvmpattern.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Article> articles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.contactList.setLayoutManager(layoutManager);

        initalize();

        ArticleAdapter adapter = new ArticleAdapter(articles,this);
        binding.contactList.setAdapter(adapter);

    }

    public void initalize(){
        articles.add(new Article("Lapiz","",true,"",1));
        articles.add(new Article("Lapicera","",true,"",2));
        articles.add(new Article("Cuaderno","",true,"",3));
        articles.add(new Article("Carpeta","",true,"",4));
        articles.add(new Article("Folios","",true,"",5));
        articles.add(new Article("SacaPunta","",true,"",6));
        articles.add(new Article("LiquidPaper","",true,"",7));
        articles.add(new Article("Cartulina","",true,"",8));
        articles.add(new Article("Forro","",true,"",9));
        articles.add(new Article("Mapas","",true,"",10));
    }
}
