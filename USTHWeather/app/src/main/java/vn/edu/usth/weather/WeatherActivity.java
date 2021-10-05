package vn.edu.usth.weather;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toolbar;

public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weatheractivity);
        ForecastFragment ff= ForecastFragment.newInstance("","");
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, ff).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
    Log.i("WeatherActivity", "=====onStart=====");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WeatherActivity", "=====onResume=====");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherActivity", "=====onPause=====");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "=====onStop=====");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "=====onDestroy=====");
    }
}