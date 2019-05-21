package com.testsvara;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
EditText user,pass;
Button login;
String userlogin, passlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText)findViewById(R.id.tfUsername);
        pass = (EditText)findViewById(R.id.tfPassword);
        login = (Button)findViewById(R.id.LogIn);
        
        login.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View arg0){
				// TODO Auto-generated method stub
				userlogin = user.getText().toString();
				passlogin = pass.getText().toString();
				
				if (userlogin.equals("svara")&&passlogin.equals("123")) {
					Intent home = new Intent(MainActivity.this, Home.class);
					startActivity(home);
					MainActivity.this.finish();
				}
				else{
					Toast.makeText(getApplicationContext(), "Username atau Password salah ", Toast.LENGTH_LONG).show();
					user.setText("");
					pass.setText("");
				}
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
