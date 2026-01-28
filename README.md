# Custom Bottom Navigation for Android

A modern, customizable U-Shaped Bottom Navigation Bar with a center Floating Action Button (FAB) for Android, built entirely with Canvas and Java.



---

## 🛠 Installation

1. Copy your `custom-bottom-nav.aar` file into the `libs` folder of your app module.
2. Open your app-level `build.gradle` file and add the following dependencies:

```gradle
dependencies {
    implementation files('libs/custom-bottom-nav.aar')
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'androidx.core:core:1.9.0'
}


<com.aynal.cnb.CustomBottomNavigation
    android:id="@+id/customBottomNav"
    android:layout_width="match_parent"
    android:layout_height="100dp"
    app:cbn_backgroundColor="#FFFFFF"
    app:cbn_fabColor="#1B7D36"
    app:cbn_activeColor="#1B7D36"
    app:cbn_inactiveColor="#757575"
    app:cbn_itemIconSize="24dp"
    app:cbn_itemTextSize="12sp"
    app:layout_constraintBottom_toBottomOf="parent" />


import com.aynal.cnb.BottomNavItem;
import com.aynal.cnb.CustomBottomNavigation;

// ...

CustomBottomNavigation bottomNav = findViewById(R.id.customBottomNav);

// Prepare the items (Exactly 5 items required)
List<BottomNavItem> items = new ArrayList<>();
items.add(new BottomNavItem("Home", ContextCompat.getDrawable(this, R.drawable.ic_home)));
items.add(new BottomNavItem("Rewards", ContextCompat.getDrawable(this, R.drawable.ic_gift)));
items.add(new BottomNavItem("Send", ContextCompat.getDrawable(this, R.drawable.ic_send))); // Index 2: Center FAB
items.add(new BottomNavItem("History", ContextCompat.getDrawable(this, R.drawable.ic_history)));
items.add(new BottomNavItem("More", ContextCompat.getDrawable(this, R.drawable.ic_grid)));

// Set items to the view
bottomNav.setItems(items);

// Handle Item Clicks
bottomNav.setOnNavigationItemSelectListener(index -> {
    switch (index) {
        case 0:
            // Load Home Fragment
            break;
        case 2:
            // Handle Center FAB Action
            break;
        case 4:
            // Open Account Activity
            break;
    }
});
