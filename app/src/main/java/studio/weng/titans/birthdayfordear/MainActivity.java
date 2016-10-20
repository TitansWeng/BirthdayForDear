package studio.weng.titans.birthdayfordear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Intent intent = new Intent();
        intent.setClass(MainActivity.this,FullscreenActivity.class);
        // 呼叫一個Activity
        startActivity(intent);
        // 關閉原本的Activity
        MainActivity.this.finish();*/
        setContentView(R.layout.activity_fullscreen);
    }
}
