package com.heweather.owp.view.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.heweather.owp.R;
import com.heweather.owp.service.LocationService;


public class SplashActivity extends AppCompatActivity {
    final int REQUEST_PERMISSION_LOCATION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initPermission();
    }

    private void initPermission() {
        if (ContextCompat.checkSelfPermission(SplashActivity.this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED || ContextCompat.checkSelfPermission(SplashActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED ) {
            // 没有权限
            ActivityCompat.requestPermissions(SplashActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.READ_EXTERNAL_STORAGE},
                    REQUEST_PERMISSION_LOCATION);
        } else {
            startService(new Intent(this, LocationService.class));
            startIntent();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_PERMISSION_LOCATION:
                startService(new Intent(this, LocationService.class));
                startIntent();
                break;
            default:
                startIntent();
                break;
        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void startIntent() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
