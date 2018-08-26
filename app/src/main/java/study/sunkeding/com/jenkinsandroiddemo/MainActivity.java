package study.sunkeding.com.jenkinsandroiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: 2018/8/26 jenkins上会不会有代码提交记录
        Toast.makeText(this, "9999", Toast.LENGTH_SHORT).show();
                
    }
}
