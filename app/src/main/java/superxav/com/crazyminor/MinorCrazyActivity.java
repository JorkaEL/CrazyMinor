package superxav.com.crazyminor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MinorCrazyActivity extends Activity {

    MinorCrazyView mcView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minorcrazy_game);

        mcView=(MinorCrazyView) findViewById(R.id.MinorCrazyView);
        mcView.parentActivity=this;

        mcView.setVisibility(View.VISIBLE);
    }


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
