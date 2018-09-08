package study.sunkeding.com.jenkinsandroiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: 2018/8/26 jenkins上会不会有代码提交记录
        Toast.makeText(this, "9999", Toast.LENGTH_SHORT).show();
        // TODO: 2018/8/27 提交记录加个todo

        TextView textView=null;
        textView.setText("dsa");
        String substring = "9999".substring(0, 10);
    }
}
