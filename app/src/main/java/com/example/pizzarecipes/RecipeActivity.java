package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        TextView titleView = findViewById(R.id.titleView);
        TextView recipeView = findViewById(R.id.recipeView);
        ImageView pizzaView = findViewById(R.id.pizzaView);
        Button button = findViewById(R.id.button);
        Intent intent = getIntent();
        if(intent!=null){
            titleView.setText(intent.getStringExtra("title"));
            pizzaView.setImageResource(intent.getIntExtra("imageResource", 0));
            recipeView.setText(intent.getStringExtra("recipe"));
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
