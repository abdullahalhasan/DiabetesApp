package dev.aahasan.diabetesschoolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MemberLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_login);
    }

    public void loginMemberButton(View view) {
        startActivity(new Intent(this,MemberDashboardActivity.class));
    }
}
