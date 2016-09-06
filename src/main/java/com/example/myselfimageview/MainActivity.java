package com.example.myselfimageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.circle_image);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test1);
        circleImageView.setImageBitmap(bitmap);
    }
}
