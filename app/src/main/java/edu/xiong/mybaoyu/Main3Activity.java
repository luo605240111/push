package edu.xiong.mybaoyu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class Main3Activity extends AppCompatActivity {
View.OnClickListener onClickListener=new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (toggleButton.isChecked()){
        startActivity(new Intent(Main3Activity.this,Main4Activity.class));
        finish();
        }
    }
};
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        toggleButton=(ToggleButton)findViewById(R.id.toggleButton2);
        toggleButton.setOnClickListener(onClickListener);
    }
}
