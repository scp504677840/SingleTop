package com.scp.singletop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class TwoActivity extends Activity implements OnClickListener {
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.two_layout);
		
		button = (Button) findViewById(R.id.btn_2);
		
		button.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		Intent intent = new Intent(TwoActivity.this, MainActivity.class);
		Toast.makeText(this, "第二个的ID是："+this.toString(), 0).show();
		startActivity(intent);
	}
}
