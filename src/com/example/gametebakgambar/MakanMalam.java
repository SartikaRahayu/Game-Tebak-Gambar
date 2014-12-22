package com.example.gametebakgambar;

import android.support.v7.app.ActionBarActivity;
import android.text.InputFilter;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MakanMalam extends ActionBarActivity {
	
	EditText jawaban;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_makan_malam);
		//Cari  komponen Edittext
  		jawaban = (EditText)findViewById(R.id.editText1);
  		//setting input dalam huruf besar
  		jawaban.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
  		
  		
  	}
      //method untuk mengecek jawaban
  	public void cekjawaban(View v){
  	String jawabanBenar = "MAKAN MALAM";
  	String jawabanUser = jawaban.getText().toString();
  	if(jawabanUser.equals(jawabanBenar)){
  		
  		//pesan Toast
  		Toast.makeText(getApplicationContext(), "JAWABAN TEPAT!", Toast.LENGTH_LONG).show();
  		
  		Intent trans = new Intent(getApplicationContext(),Samanhudi.class);
  		startActivity(trans);

  	}else{
  		//pesan Toast
  		Toast.makeText(getApplicationContext(), "JAWABAN MASIH SALAH!", Toast.LENGTH_LONG).show();
  	}
  	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.makan_malam, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
