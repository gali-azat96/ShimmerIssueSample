package io.supercharge.shimmeringlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.concurrent.TimeUnit;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShimmerLayout shimmerLayout = findViewById(R.id.shimmer_software_layer);
        shimmerLayout.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }
}
