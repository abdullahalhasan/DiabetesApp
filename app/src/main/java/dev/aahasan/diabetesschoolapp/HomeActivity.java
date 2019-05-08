package dev.aahasan.diabetesschoolapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class HomeActivity extends AppCompatActivity {

    private Button homeVideoActionBtn;
    private VideoView homeVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeVideoActionBtn = findViewById(R.id.homeVideoActionBT);
        homeVideoView = findViewById(R.id.homeVideoView);

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setTitle(getString(R.string.exit_app));
        dialogBuilder.setMessage(getString(R.string.exit_desc));
        dialogBuilder.setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        dialogBuilder.setNegativeButton(getString(R.string.no), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialogBuilder.setIcon(R.drawable.ic_exit_24dp);
        dialogBuilder.show();
    }

    public void homeButton(View view) {
        startActivity(new Intent(this,HomeActivity.class));
        finish();
    }

    public void docListButton(View view) {
        startActivity(new Intent(this,DoctorActivity.class));
        finish();
    }

    public void bmiCalculatorsButton(View view) {
        startActivity(new Intent(this,BmiActivity.class));
        finish();
    }

    public void aboutDiabetesButton(View view) {
        startActivity(new Intent(this,AboutDiabetesActivity.class));
        finish();
    }

    public void moreButton(View view) {
        startActivity(new Intent(this,MoreActivity.class));
        finish();
    }

    public void homeVideoView(View view) {

        String videoPath = "android.resource://"+getPackageName()+"/"+R.raw.v1;
        Uri uri = Uri.parse(videoPath);
        homeVideoView.setVideoURI(uri);

        if (homeVideoView.isPlaying()) {
            stop();
        } else if (!homeVideoView.isPlaying()){
           play();
        }

    }

    public void play() {
        homeVideoView.start();
        homeVideoActionBtn.setText("Stop");
    }

    public void stop(){
        homeVideoView.stopPlayback();
        homeVideoActionBtn.setText("Play");
    }
}
