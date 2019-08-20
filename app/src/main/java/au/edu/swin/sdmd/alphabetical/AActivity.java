package au.edu.swin.sdmd.alphabetical;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

/**
 * author nronald
 * August 2019
 *
 * This is a lecture example for playing with activity stacks; it is not intended as usable code.
 *
 * In order to see the activity stacks, open the Terminal, and cd into the sdk directory on your
 * machine (to find where this is, open the SDK Manager). Type in:
 *
 * ./adb shell dumpsys activity activities
 *
 * and scroll up until you see a list of activities under the heading
 * "Running activities (most recent first):".
 *
 * Play around with the android:launchMode setting in the manifest file to see some different
 * configs, but note that "standard" is called standard for a reason.
 *
 */

public class AActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BActivity.class);
                view.getContext().startActivity(intent);
            }
        });
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
        if (id == R.id.action_a) {
            Intent intent = new Intent(this, AActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.action_d) {
            Intent intent = new Intent(this, DActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
