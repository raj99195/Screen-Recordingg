package com.example.screenrecording1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class VideoActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private List<video> videoList;
    private VideoAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoList = new ArrayList<>();
        viewPager2 = findViewById(R.id.viewPager2);

        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.i , "SRMS TRUST" , "Activities in SRMS College "));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.l , "SRMS TRUST" , "Activities in SRMS College"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.q , "SRMS TRUST" , "Activities in SRMS College"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.r , "SRMS TRUST" , "Activities in SRMS College "));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.s , "SRMS TRUST" , "Activities in SRMS College"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.u , "SRMS TRUST" , "Activities in SRMS College"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.w , "SRMS TRUST" , "Activities in SRMS College"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.x , "SRMS TRUST" , "Activities in SRMS College"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.a , "Some Fun" , "Activities in SRMS College"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.e , "Interest" , "Activities in SRMS College"));


        adapter = new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);

    }
}