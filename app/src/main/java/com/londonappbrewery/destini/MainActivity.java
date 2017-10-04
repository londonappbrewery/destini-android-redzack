package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.londonappbrewery.destini.R.id.storyTextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
     TextView mTextView;
     Button mButtonTop,mButtonBottom;
     int mIndex=1;

    Destiny[] mDestiny = {
            new Destiny(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new Destiny(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new Destiny(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex==1){
                    mIndex=3;
                    Log.d("Destiny","Story Index "+mIndex);
                    mTextView.setText(mDestiny[mIndex-1].getStoryNum());
                    mButtonTop.setText(mDestiny[mIndex-1].getTopButtonNum());
                    mButtonBottom.setText(mDestiny[mIndex-1].getBottomButtonNum());

                }else if(mIndex == 3){
                    mTextView.setText(R.string.T6_End);
                    mButtonBottom.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                }else if(mIndex == 2){
                    mIndex = 3;
                    mTextView.setText(mDestiny[mIndex-1].getStoryNum());
                    mButtonTop.setText(mDestiny[mIndex-1].getTopButtonNum());
                    mButtonBottom.setText(mDestiny[mIndex-1].getBottomButtonNum());
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex == 1){
                    mIndex = 2;
                    mTextView.setText(mDestiny[mIndex-1].getStoryNum());
                    mButtonTop.setText(mDestiny[mIndex-1].getTopButtonNum());
                    mButtonBottom.setText(mDestiny[mIndex-1].getBottomButtonNum());
                }else if (mIndex == 2){
                    mTextView.setText(R.string.T4_End);
                    mButtonBottom.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                }else if (mIndex == 3){
                    mTextView.setText(R.string.T5_End);
                    mButtonBottom.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                }
            }
        });

    }
}
