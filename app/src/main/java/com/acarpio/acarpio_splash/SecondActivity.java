package com.acarpio.acarpio_splash;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView menuList = findViewById(R.id.menuList);

        String[] items = { getResources().getString(R.string.menu_item_play),
                getResources().getString(R.string.menu_item_scores),
                getResources().getString(R.string.menu_item_settings),
                getResources().getString(R.string.menu_item_help) };

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.menu_item, items);
        menuList.setAdapter(adapt);

        //Listener

        menuList.setOnItemClickListener((parent, view, position, id) -> {
            switch (position) {
                case 0:
                    Toast.makeText(this, "You clicked position 0 : Play Game", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Toast.makeText(this, "You clicked position 1 : View Scores", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Toast.makeText(this, "You clicked position 2 : Settings", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Toast.makeText(this, "You clicked position 3 : Help", Toast.LENGTH_SHORT).show();
                    break;
            }
        });
        }
 }
