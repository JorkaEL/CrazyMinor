package superxav.com.crazyminor;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    Intent intentVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);
        intentVar = new Intent(this, MinorCrazyActivity.class);


        Button btnStart = (Button) findViewById(R.id.buttonStart);
        btnStart.setOnClickListener(new ButtonStartClickListener(btnStart));

    }

    class ButtonStartClickListener implements View.OnClickListener {
        Button btn;

        ButtonStartClickListener(Button button) {
            this.btn = button;
        }

        @Override
        public void onClick(View v) {
            Log.i("New"," Game");
            intentVar.putExtra("NEW",true);
            startActivity(intentVar);
        }
    };

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
