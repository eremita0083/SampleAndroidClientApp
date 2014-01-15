package com.example.sampleandroidclientapp;

import org.json.JSONObject;

import io.socket.IOAcknowledge;
import io.socket.IOCallback;
import io.socket.SocketIO;
import io.socket.SocketIOException;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	private SocketIO socketIo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private IOCallback ioCallback = new IOCallback() {
		
		@Override
		public void onMessage(JSONObject arg0, IOAcknowledge arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onMessage(String arg0, IOAcknowledge arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onError(SocketIOException arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onDisconnect() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onConnect() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void on(String arg0, IOAcknowledge arg1, Object... arg2) {
			// TODO Auto-generated method stub
			
		}
	};
	
}
