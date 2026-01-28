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

```gradle
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
