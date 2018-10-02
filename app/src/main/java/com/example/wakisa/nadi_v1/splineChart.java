package com.example.wakisa.nadi_v1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.numetriclabz.numandroidcharts.ChartData;
import com.numetriclabz.numandroidcharts.SplineChart;

import java.util.ArrayList;
import java.util.List;

public class splineChart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spline_chart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        SplineChart lineChart = (SplineChart) findViewById(R.id.spline_view);
        ArrayList<ChartData> values = new ArrayList<>();
        ArrayList<String>v=new ArrayList<>();

        v.add(new String("5"));
                values.add(new ChartData(1f,1f));
                values.add(new ChartData(2f, 2f));
                values.add(new ChartData(3f, 3f));
                values.add(new ChartData(4f, 4f));
                values.add(new ChartData(5f, 5f));
                values.add(new ChartData(6f, 6f));
        values.add(new ChartData(7f,7f));
        values.add(new ChartData(8f, 8f));
        values.add(new ChartData(9f, 9f));
        values.add(new ChartData(10f, 10f));
        values.add(new ChartData(11f, 11f));
        values.add(new ChartData(12f, 12f));
                lineChart.setCircleSize(0f);
                ;



                lineChart.setData(values);

    }

}
