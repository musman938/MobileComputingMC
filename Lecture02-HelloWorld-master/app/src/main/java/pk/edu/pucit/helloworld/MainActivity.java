package pk.edu.pucit.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    TextView viewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewer = findViewById(R.id.textview);
        viewer.setText(counter + "");

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                viewer.setText(counter + "");
            }
        };
        View.OnClickListener declistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                viewer.setText(counter + "");
            }
        };
        Button btn_inc = findViewById(R.id.btn);
        btn_inc.setOnClickListener(listener);
        Button btn_dec = findViewById(R.id.btn2);
        btn_dec.setOnClickListener(declistener);
        String message = getString(android.R.string.dialog_alert_title);

//        AlertDialog ad = new AlertDialog.Builder(this)
//                .setMessage(R.string.message)
//                .setTitle(getString(android.R.string.dialog_alert_title))
//                .create();
//        ad.show();
        Toast.makeText(this,"This is a String!",Toast.LENGTH_LONG).show();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu_reset){
            counter=0;
            viewer.setText(counter + "");
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }
}
