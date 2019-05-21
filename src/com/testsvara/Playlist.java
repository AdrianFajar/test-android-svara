package com.testsvara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Playlist extends Activity{
ListView daftarmusik;
String subjudul[]={"Sam Smith", "Sam Smith", "Sam Smith", "Sam Smith"};
int musicicon[]={R.drawable.icon_playlist, R.drawable.icon_music, R.drawable.icon_artist, R.drawable.icon_radio, R.drawable.icon_radio_content, R.drawable.icon_album, R.drawable.icon_upload_content};
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);
        daftarmusik = (ListView)findViewById(R.id.daftarmusik);
        

        String values[]={"Dancing With A Stranger", "Fire On Fire ", "Promise", "Pray"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        daftarmusik.setAdapter(adapter);
        
        daftarmusik.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> aView, View View, int posisi,
					long id) {
				// TODO Auto-generated method stub
				switch(posisi){
        		case 0:
        			Intent i = new Intent(Playlist.this, Lagu1.class);
        			startActivity(i);
        			break;
        		case 1:
        			Intent j = new Intent(Playlist.this, Music.class);
        			startActivity(j);
        			break;
        		case 2:
        			Intent k = new Intent(Playlist.this, Music.class);
        			startActivity(k);
        			break;
        		case 3:
        			Intent l = new Intent(Playlist.this, Music.class);
        			startActivity(l);
        			break;
        		default:
        			break;
        		}
			}
        	
        });
        
	}
}
