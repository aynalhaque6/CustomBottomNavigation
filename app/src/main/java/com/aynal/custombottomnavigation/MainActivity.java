package com.aynal.custombottomnavigation;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.aynal.cnb.BottomNavItem;
import com.aynal.cnb.CustomBottomNavigation;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CustomBottomNavigation bottomNav = findViewById(R.id.customBottomNav);

        List<BottomNavItem> items = new ArrayList<>();
        items.add(new BottomNavItem("Home", ContextCompat.getDrawable(this, R.drawable.ic_home)));
        items.add(new BottomNavItem("Rewards", ContextCompat.getDrawable(this, R.drawable.ic_gift)));
        items.add(new BottomNavItem("More", ContextCompat.getDrawable(this, R.drawable.ic_grid)));

        bottomNav.setItems(items);

        bottomNav.setNotchEnabled(true);
        bottomNav.setNotchIndex(1); // History index

        bottomNav.setOnNavigationItemSelectListener(index -> {
            switch (index) {
                case 0:
                    Toast.makeText(this, "Clicked Home", Toast.LENGTH_SHORT).show();
                    // Load Home Fragment
                    break;
                case 2:
                    Toast.makeText(this, "Clicked Rewards", Toast.LENGTH_SHORT).show();
                    // Handle Center FAB Action
                    break;
                case 4:
                    Toast.makeText(this, "Clicked More", Toast.LENGTH_SHORT).show();
                    // Open Account Activity
                    break;
            }
        });
    }
}