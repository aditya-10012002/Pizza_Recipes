package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import static com.example.pizzarecipes.Utils.Pizza_1_recipe;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<PizzaRecipeItem> pizzaRecipeItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizzaRecipeItems = new ArrayList<>();
        fill();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }

    private void fill() {
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1, Utils.pizza_1_title, Utils.pizza_1_description, Utils.Pizza_1_recipe));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza2, Utils.pizza_2_title, Utils.pizza_2_description, Utils.Pizza_2_recipe));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza3, Utils.pizza_3_title, Utils.pizza_3_description, Utils.Pizza_3_recipe));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza4, Utils.pizza_4_title, Utils.pizza_4_description, Utils.Pizza_4_recipe));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza5, Utils.pizza_5_title, Utils.pizza_5_description, Utils.Pizza_5_recipe));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza6, Utils.pizza_6_title, Utils.pizza_6_description, Utils.Pizza_6_recipe));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza7, Utils.pizza_7_title, Utils.pizza_7_description, Utils.Pizza_7_recipe));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza8, Utils.pizza_8_title, Utils.pizza_8_description, Utils.Pizza_8_recipe));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza9, Utils.pizza_9_title, Utils.pizza_9_description, Utils.Pizza_9_recipe));
    }
}
