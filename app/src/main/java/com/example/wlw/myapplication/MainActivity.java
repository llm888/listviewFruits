package com.example.wlw.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruits> fruitsList=new ArrayList<Fruits>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruits_item,fruitsList);
        ListView listview= (ListView) findViewById(R.id.list_view);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Fruits fruits= (Fruits) adapterView.getItemAtPosition(i);
                String title=fruits.getTitle();
                Toast.makeText(MainActivity.this, title, Toast.LENGTH_SHORT).show();


            }
        });











    }
    private  void initFruits(){
        Fruits fruits;
        fruits =new Fruits(R.drawable.apple_pic,"苹果","这是一个苹果");
        fruitsList.add(fruits);
        fruits =new Fruits(R.drawable.orange_pic,"橙子","这是一个橙子");
        fruitsList.add(fruits);
        fruits =new Fruits(R.drawable.banana_pic,"香蕉","这是一个香蕉");
        fruitsList.add(fruits);
        fruits =new Fruits(R.drawable.watermelon_pic,"西瓜","这是一个西瓜");
        fruitsList.add(fruits);



    }
}
