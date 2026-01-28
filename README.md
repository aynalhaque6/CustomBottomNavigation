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

    CustomBottomNavigation bottomNav = findViewById(R.id.customBottomNav);

List<BottomNavItem> items = new ArrayList<>();
items.add(new BottomNavItem("Home", ContextCompat.getDrawable(this, R.drawable.ic_home)));
items.add(new BottomNavItem("Rewards", ContextCompat.getDrawable(this, R.drawable.ic_gift)));
items.add(new BottomNavItem("Send", ContextCompat.getDrawable(this, R.drawable.ic_send))); // Center FAB
items.add(new BottomNavItem("History", ContextCompat.getDrawable(this, R.drawable.ic_history)));
items.add(new BottomNavItem("More", ContextCompat.getDrawable(this, R.drawable.ic_grid)));

bottomNav.setItems(items);

bottomNav.setOnNavigationItemSelectListener(index -> {
    // Handle navigation logic here
    switch (index) {
        case 0: /* Load Home Fragment */ break;
        case 2: /* Handle FAB Click */ break;
    }
});

#Attribute,Description,Default Value
cbn_backgroundColor,Sets the background color of the navigation bar.,#FFFFFF (White)
cbn_fabColor,Sets the color of the center Floating Action Button (FAB).,#1B7D36 (Green)
cbn_activeColor,Sets the color for the selected item (icon and text).,#1B7D36 (Green)
cbn_inactiveColor,Sets the color for unselected items.,#757575 (Gray)
cbn_itemIconSize,Sets the size of the side icons.,24dp
cbn_itemTextSize,Sets the font size of the item labels.,12sp
cbn_fabSize,Sets the diameter of the center FAB.,56dp
