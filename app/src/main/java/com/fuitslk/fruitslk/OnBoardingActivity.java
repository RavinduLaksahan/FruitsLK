/*package com.fuitslk.fruitslk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.transition.Slide;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OnBoardingActivity extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dotsLayout;

    Button btn;
    SlideAdapter slideAdapter;

    TextView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_on_boarding);

        //hide toolbar
        //getSupportActionBar().hide();

        viewPager = findViewById(R.id.slider);
        dotsLayout = findViewById(R.id.dots);
        btn = findViewById(R.id.get_started_btn);

        addDots(0);

        viewPager.addOnPageChangeListener(changeListener);

        //call adapter

        slideAdapter = new SlideAdapter(this);
        viewPager.setAdapter(slideAdapter);
    }
    private void addDots(int position){
        dots = new TextView[3];
        dotsLayout.removeAllViews();
        for(int i = 0;i < dots.length;i++){
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dotsLayout.addView(dots[i]);
        }
        if(dots.length>0){
            dots[position].setTextColor(getResources().getColor(R.color.purple_500));
        }

    }
    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            addDots(position);
            if(position ==0){
                btn.setVisibility(View.INVISIBLE);
            }else if(position==1){
                btn.setVisibility(View.INVISIBLE);
            }else{
                btn.setVisibility(View.INVISIBLE);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}*/