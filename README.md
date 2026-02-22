# Custom Bottom Navigation (Curved / Notched) — com.aynal.cnb

A lightweight **Custom Bottom Navigation** library that supports:
- ✅ Any number of menu items (not limited to a fixed 5)
- ✅ A **curve / notch** on *any* item index (not only the middle)
- ✅ Optional notch (enable/disable anytime)
- ✅ Simple item click listener

---

## Features

- Dynamic item count (2, 3, 5, 7… as many as you want)
- Notch/curve can be moved to any index
- Notch can be turned off (straight bar)
- Callback for item selection

---

## Installation

### As a Module
If you added this library as a module (recommended for local development):

**settings.gradle**
```gradle
include ':cnb'
```

**app/build.gradle**
```gradle
dependencies {
    implementation project(':cnb')
}
```

Sync the project.

---

## XML Usage

Add the view in your layout:

```xml
<com.aynal.cnb.CustomBottomNavigation
    android:id="@+id/customBottomNav"
    android:layout_width="match_parent"
    android:layout_height="72dp"
    app:cbn_notchEnabled="true"
    app:cbn_notchIndex="2"/>
```

### Attributes

| Attribute | Description |
|---|---|
| `cbn_notchEnabled` | Enable/disable the notch/curve |
| `cbn_notchIndex` | 0-based index for the notch. Use `-1` to disable notch |

> **Note:** `cbn_notchIndex` must be a valid item index (0..itemsCount-1) when notch is enabled.

---

## Java Usage

### 1) Create and Set Items

```java
CustomBottomNavigation bottomNav = findViewById(R.id.customBottomNav);

List<BottomNavItem> items = new ArrayList<>();
items.add(new BottomNavItem("Home", ContextCompat.getDrawable(this, R.drawable.ic_home)));
items.add(new BottomNavItem("Rewards", ContextCompat.getDrawable(this, R.drawable.ic_gift)));
items.add(new BottomNavItem("Send", ContextCompat.getDrawable(this, R.drawable.ic_send)));
items.add(new BottomNavItem("History", ContextCompat.getDrawable(this, R.drawable.ic_history)));
items.add(new BottomNavItem("More", ContextCompat.getDrawable(this, R.drawable.ic_grid)));

bottomNav.setItems(items);
```

✅ You can add 2 items or 10 items — there is no fixed limit.

---

### 2) Enable Notch/Curve on Any Index

```java
bottomNav.setNotchEnabled(true);
bottomNav.setNotchIndex(3); // notch on item index 3
```

---

### 3) Disable Notch (Straight Bar)

```java
bottomNav.setNotchEnabled(false);
// OR
bottomNav.setNotchIndex(-1);
```

---

## Item Click Listener

```java
bottomNav.setOnNavigationItemSelectListener(new CustomBottomNavigation.OnNavigationItemSelectListener() {
    @Override
    public void onItemSelected(int index) {
        Toast.makeText(MainActivity.this, "Clicked: " + index, Toast.LENGTH_SHORT).show();
    }
});
```

---

## Full Example

```java
CustomBottomNavigation bottomNav = findViewById(R.id.customBottomNav);

List<BottomNavItem> items = new ArrayList<>();
items.add(new BottomNavItem("Home", ContextCompat.getDrawable(this, R.drawable.ic_home)));
items.add(new BottomNavItem("Rewards", ContextCompat.getDrawable(this, R.drawable.ic_gift)));
items.add(new BottomNavItem("Send", ContextCompat.getDrawable(this, R.drawable.ic_send)));
items.add(new BottomNavItem("History", ContextCompat.getDrawable(this, R.drawable.ic_history)));
items.add(new BottomNavItem("More", ContextCompat.getDrawable(this, R.drawable.ic_grid)));
items.add(new BottomNavItem("Profile", ContextCompat.getDrawable(this, R.drawable.ic_profile))); // extra

bottomNav.setItems(items);

// Notch on index 2 (Send)
bottomNav.setNotchEnabled(true);
bottomNav.setNotchIndex(2);

bottomNav.setOnNavigationItemSelectListener(index -> {
    // handle navigation here
});
```

---

## Notes / Tips

- If you have `N` items, valid indexes are `0 .. N-1`.
- Use `setNotchIndex(-1)` or `setNotchEnabled(false)` to remove the notch completely.
- You can change the notch index at runtime (dynamic notch).

---

## License

Private / Internal use (adjust as needed).
