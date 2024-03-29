package app.com.shah.komal.myportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch the music app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void sendMessage2(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch the scores app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void sendMessage3(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch the library app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void sendMessage4(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch the building app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void sendMessage5(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch the reader app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void sendMessage6(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my capstone app", Toast.LENGTH_SHORT);
        toast.show();
    }
}
