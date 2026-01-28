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

// লিস্ট তৈরি করুন
        List<BottomNavItem> items = new ArrayList<>();
        items.add(new BottomNavItem("Home", ContextCompat.getDrawable(this, R.drawable.ic_home)));
        items.add(new BottomNavItem("Rewards", ContextCompat.getDrawable(this, R.drawable.ic_gift)));
        items.add(new BottomNavItem("Send", ContextCompat.getDrawable(this, R.drawable.ic_send))); // FAB Icon
        items.add(new BottomNavItem("History", ContextCompat.getDrawable(this, R.drawable.ic_history)));
        items.add(new BottomNavItem("More", ContextCompat.getDrawable(this, R.drawable.ic_grid)));

// ভিউতে সেট করুন
        bottomNav.setItems(items);

// লিসেনার
        bottomNav.setOnNavigationItemSelectListener(new CustomBottomNavigation.OnNavigationItemSelectListener() {
            @Override
            public void onItemSelected(int index) {
                Toast.makeText(MainActivity.this, "Clicked: " + index, Toast.LENGTH_SHORT).show();
            }
        });
    }
}