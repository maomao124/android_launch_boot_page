package mao.android_launch_boot_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import mao.android_launch_boot_page.adapter.LaunchAdapter;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.ViewPager);
        LaunchAdapter launchAdapter = new LaunchAdapter(this);
        viewPager.setAdapter(launchAdapter);
    }
}