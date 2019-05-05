package dev.aahasan.diabetesschoolapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
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

    public void sponsorsButton(View view) {
        startActivity(new Intent(this,SponsorsActivity.class));
    }

    public void hospitalListButton(View view) {
        startActivity(new Intent(this,HospitalListActivity.class));
    }

    public void aboutAppButton(View view) {
        startActivity(new Intent(this,AboutAppActivity.class));
    }

    public void scheduleButton(View view) {
        startActivity(new Intent(this,ScheduleActivity.class));
    }

    public void memberLoginButton(View view) {
        startActivity(new Intent(this, MemberLoginActivity.class));
    }

    public void volunteerLoginButton(View view) {
        startActivity(new Intent(this, VolunteerLoginActivity.class));
    }

    public void userLoginButton(View view) {
        startActivity(new Intent(this, UserLoginActivity.class));
    }
}
