package edu.xiong.mybaoyu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    //1.得到我们的CheckBox
    //2.TextView
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //3.初始化
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        //设置代码来设置我们的checkBox3被选中
        checkBox3.setChecked(true);

        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(onClickListener);
    }

    //添加点击事件
    public void btn_click(View view) {
        //4.点击显示我们被选中的信息
        //判断
        //定义一个字符串，用于显示到TextView中
        String string = "";
        /// /1.睡觉被选中
        if (checkBox1.isChecked()) {
            string += "睡觉\n";
        }
        //吃饭
        if (checkBox2.isChecked()) {
            string+="吃饭\n";
        }
        //打豆豆
        if (checkBox3.isChecked()) {
            string+="打豆豆";
        }
        //设置
        textView.setText(string);
    }
    View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Main2Activity.this,Main3Activity.class));
            finish();
        }
    };
}

