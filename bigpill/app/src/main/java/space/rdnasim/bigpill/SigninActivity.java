package space.rdnasim.bigpill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void signUp(View view) {
        Intent intent = new Intent(SigninActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
}