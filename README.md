---



```gradle
dependencies {
}


<com.aynal.cnb.CustomBottomNavigation
    android:id="@+id/customBottomNav"
    android:layout_width="match_parent"




CustomBottomNavigation bottomNav = findViewById(R.id.customBottomNav);

List<BottomNavItem> items = new ArrayList<>();
items.add(new BottomNavItem("Home", ContextCompat.getDrawable(this, R.drawable.ic_home)));
items.add(new BottomNavItem("Rewards", ContextCompat.getDrawable(this, R.drawable.ic_gift)));
items.add(new BottomNavItem("History", ContextCompat.getDrawable(this, R.drawable.ic_history)));
items.add(new BottomNavItem("More", ContextCompat.getDrawable(this, R.drawable.ic_grid)));

bottomNav.setItems(items);

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
