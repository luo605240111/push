package edu.xiong.mybaoyu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //取得一组的RadioGroup
    private RadioGroup radioGroup;
    //用于显示信息
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //控件一般情况下我们都在初始化中得到
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(onClickListener);
    }

    //点击按钮事件
    public void btn_click(View view) {
        //如果没有选中任何一个单选时，返回的值是-1
        //得到我们一组中的那个单选被点下的
        // textView.setText(String.valueOf(radioGroup.getCheckedRadioButtonId())+"选中"+R.id.radioButton1);
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.radioButton1:
                textView.setText("男");
                break;
            case R.id.radioButton2:
                textView.setText("女");
                break;
            default:
                textView.setText("没有选中");
                break;
        }
    }
    View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this,Main2Activity.class));
            finish();
        }
    };
}

