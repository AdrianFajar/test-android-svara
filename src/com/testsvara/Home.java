package com.testsvara;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class Home extends Activity{
ListView daftarmenu;
String menulist[]={"Playlist", "Music", "Artist", "Radio", "Radio Content", "Album", "Uplaoded Content"};
int menuicon[]={R.drawable.icon_playlist, R.drawable.icon_music, R.drawable.icon_artist, R.drawable.icon_radio, R.drawable.icon_radio_content, R.drawable.icon_album, R.drawable.icon_upload_content};

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        daftarmenu =(ListView)findViewById(R.id.daftarmenu);
        
        String[] values = new String[]{"Playlist","Music","Artist","Radio","Radio Content", "Album", "Uploaded Content"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        daftarmenu.setAdapter(adapter);
        
        daftarmenu.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> aView, View View, int posisi,
					long id) {
				// TODO Auto-generated method stub
				switch(posisi){
        		case 0:
        			Intent i = new Intent(Home.this, Playlist.class);
        			startActivity(i);
        			break;
        		case 1:
        			Intent j = new Intent(Home.this, Playlist.class);
        			startActivity(j);
        			break;
        		case 2:
        			Intent k = new Intent(Home.this, Playlist.class);
        			startActivity(k);
        			break;
        		case 3:
        			Intent l = new Intent(Home.this, Playlist.class);
        			startActivity(l);
        			break;
        		case 4:
        			Intent m = new Intent(Home.this, Playlist.class);
        			startActivity(m);
        			break;
        		case 5:
        			Intent n = new Intent(Home.this, Playlist.class);
        			startActivity(n);
        			break;
        		case 6:
        			Intent o = new Intent(Home.this, Playlist.class);
        			startActivity(o);
        			break;
        			
        		default:
        			break;
        		}
			}
        	
        });
    }
}
