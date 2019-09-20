package com.ao.quranproject.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.ao.quranproject.MainActivity;
import com.ao.quranproject.R;

public class SplashActivity extends AppCompatActivity {


	private ImageView imageSplash;
	private Animation anim;
	private static final long SPLASH_DISPLAY_LENGTH = 3000;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		view_Splash();


	}
		public void view_Splash(){

		imageSplash = findViewById(R.id.imageSplash);

		anim  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splashanim);
		imageSplash.startAnimation(anim);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {

				startActivity(new Intent( SplashActivity.this, MainActivity.class));
				finish();


			}
		}, SPLASH_DISPLAY_LENGTH);
	}




}
