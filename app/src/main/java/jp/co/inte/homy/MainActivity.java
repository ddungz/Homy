package jp.co.inte.homy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity  {

    private TextView headerID, cleaningTV, handymanID, plumbingID, electricalID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        headerID = (TextView)findViewById(R.id.headerID);
        cleaningTV = (TextView)findViewById(R.id.cleaningID);
        handymanID = (TextView)findViewById(R.id.handymanID);
        plumbingID = (TextView)findViewById(R.id.plumbingID);
        electricalID = (TextView)findViewById(R.id.electricalID);

        headerID.setBackgroundColor(getResources().getColor(R.color.mainColor));
        cleaningTV.setTextColor(getResources().getColor(R.color.mainColor));
        handymanID.setTextColor(getResources().getColor(R.color.mainColor));
        plumbingID.setTextColor(getResources().getColor(R.color.mainColor));
        electricalID.setTextColor(getResources().getColor(R.color.mainColor));

        cleaningTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void onClick(View view) {

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
}
