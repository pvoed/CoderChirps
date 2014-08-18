package com.example.coderchirps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.example.modelclasses.Chirp;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {


	private ArrayList<String> list = new ArrayList<String>(); // maybe not needed?
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		populateTest();
		//maybe able to scrap list entirely?
		this.adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);
		//this.adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
		setListAdapter(adapter);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	public void populateTest()
	{
		
		this.list.add("test1");
		this.list.add("test2");
		this.list.add("test3");
		Collections.reverse(list); //cheap way of getting it to display right
	}
	public void submitChirp(View view){
		EditText editText = (EditText) findViewById(R.id.chirpTextField);
		
		Chirp chirp = new Chirp();
		chirp.set(editText.getText().toString());
		list.add(chirp.getBody());
		Collections.reverse(list); //cheap way of getting it to display right
		//Change state of list to add new statement
		adapter.notifyDataSetChanged();
	
		
	}
}
