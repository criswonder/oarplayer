package com.wodekouwei.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  private Button btn;
  private EditText et;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    btn = (Button) findViewById(R.id.btn);
    et = (EditText) findViewById(R.id.et);
    btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
//        String rtmpUrl = et.getText().toString();
//        String rtmpUrl = "rtmp://live.cctvcj.com/cctvcj/live1";
//        String rtmpUrl = "rtmp//live.hkstv.hk.lxdns.com/live/hks";
//        String rtmpUrl = "rtmp://116.213.200.53/tslsChannelLive/PCG0DuD/live";
//        String rtmpUrl = "rtmp://58.200.131.2:1935/livetv/hunantv";
        String rtmpUrl = "rtmp://202.69.69.180:443/webcast/bshdlive-pc";
        if (TextUtils.isEmpty(rtmpUrl)) {
          Toast.makeText(MainActivity.this, "请输入播放地址", Toast.LENGTH_SHORT).show();
        } else {
          Intent intent = new Intent(MainActivity.this, PlayerAty.class);
          intent.putExtra("rtmp_url", rtmpUrl);
          startActivity(intent);
        }
      }
    });
  }
}
