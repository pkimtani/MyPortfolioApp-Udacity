package android.alfainfinity.co.myportfolioudacity;

import android.alfainfinity.co.myportfolioudacity.R;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class HomeScreen extends ActionBarActivity {

    Button mediaStreamer, scoreApp, libraryApp, buildBiggerApp, xyzReader, capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mediaStreamer = (Button) findViewById(R.id.streamer);
        scoreApp = (Button) findViewById(R.id.scoreApp);
        libraryApp = (Button) findViewById(R.id.libraryApp);
        buildBiggerApp = (Button) findViewById(R.id.bigger);
        xyzReader = (Button) findViewById(R.id.xyzReader);
        capstone = (Button) findViewById(R.id.capstone);

        mediaStreamer.setOnClickListener(appBanOnClickListener);
        scoreApp.setOnClickListener(appBanOnClickListener);
        libraryApp.setOnClickListener(appBanOnClickListener);
        buildBiggerApp.setOnClickListener(appBanOnClickListener);
        xyzReader.setOnClickListener(appBanOnClickListener);
        capstone.setOnClickListener(appBanOnClickListener);


    }

    View.OnClickListener appBanOnClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            switch(view.getId())
            {
                case R.id.streamer:
                    showToast("Spotify Streamer");
                    break;
                case R.id.scoreApp:
                    showToast("Score App");
                    break;
                case R.id.libraryApp:
                    showToast("Library App");
                    break;
                case R.id.bigger:
                    showToast("Build It Bigger");
                    break;
                case R.id.xyzReader:
                    showToast("XYZ Reader");
                    break;
                case R.id.capstone:
                    showToast("Capstone: My Own App");
                    break;
                default: showToast("Unknown Button");
            }
        }
    };


    public void showToast(String s)
    {
        Toast.makeText(this, "This button will launch " + s, Toast.LENGTH_SHORT).show();
    }
}
