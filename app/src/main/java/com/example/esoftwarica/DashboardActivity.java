package com.example.esoftwarica;

import android.os.Bundle;

import com.example.esoftwarica.ui.dashboard.DashboardFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
        DashboardFragment.studentInfoArrayList.add(new StudentInfo("Amulya","20","Kathmandu","Male",R.drawable.ic_account_circle_black_24dp));
        DashboardFragment.studentInfoArrayList.add(new StudentInfo("Astha","20","Hetauda","Female",R.drawable.ic_account_circle_black_24dp));
        DashboardFragment.studentInfoArrayList.add(new StudentInfo("May","28","London","Female",R.drawable.ic_account_circle_black_24dp));

    }

}
