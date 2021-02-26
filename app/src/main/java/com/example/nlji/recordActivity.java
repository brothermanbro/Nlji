package com.example.nlji;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class recordActivity extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.activity_record, container, false);
        navi=rootView.findViewById(R.id.nav_view);
        chart = rootView.findViewById(R.id.linechart1);
        chart2 = rootView.findViewById(R.id.linechart2);
        ArrayList<Entry> entry1 = new ArrayList<>();
        ArrayList<Entry> entry2 = new ArrayList<>();
        ImageView imageView = rootView.findViewById(R.id.album1);
        ImageView imageView2 = rootView.findViewById(R.id.album2);


        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        String[] xAxisLables = new String[]{"JAN","FEB", "MAR", "APR","MAY","JUN","   "};


        List<Entry> height = height();
        List<Entry> AvHeight = AvHeight();
        LineDataSet set1;
        LineDataSet set2;



        set1 = new LineDataSet(height, "우리아이");
        set1.setLineWidth(1.5f);
        set1.setColor(Color.parseColor("#FF8762"));
        set1.setDrawValues(false);
        set1.setDrawCircles(false);
        dataSets.add(set1);


        set2 = new LineDataSet(AvHeight, "평균");
        set2.setLineWidth(1.5f);
        set2.enableDashedLine(10, 6, 2 );
        set2.setColor(Color.parseColor("#FFFF8762"));
        set2.setDrawValues(false);
        set2.setDrawCircles(false);
        dataSets.add(set2);


        chart.setTouchEnabled(false);
        chart.setDrawGridBackground(false);
        chart.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisLables));
        chart.setMaxVisibleValueCount(90);
        // chart.setExtraLeftOffset(15);
        //chart.setExtraRightOffset(15);

        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(Color.parseColor("#999999"));
        xAxis.setTextSize(8);
        xAxis.setDrawGridLines(true);
        xAxis.setLabelCount(6, true);
        xAxis.setAxisLineColor(Color.parseColor("#999999"));
        xAxis.setAxisMaximum(5f);
        xAxis.setAxisMinimum(0f);

        //xAxis.setGranularity(5);


        chart.setBorderColor(Color.parseColor("#999999"));



        YAxis YAxis = chart.getAxisLeft();
        YAxis.setTextColor(Color.parseColor("#999999"));
        YAxis.setTextSize(8);
        YAxis.setLabelCount(6, true);
        YAxis.setGridColor(Color.parseColor("#999999"));

        YAxis yRAxis = chart.getAxisRight();
        yRAxis.setLabelCount(6, true);
        yRAxis.setDrawLabels(false);
        yRAxis.setDrawAxisLine(true);
        yRAxis.setDrawGridLines(true);


        LineData data = new LineData(dataSets);
        chart.setData(data);
        chart.animateX(1500);
        chart.invalidate();
        chart.getLegend().setEnabled(false);
        chart.getDescription().setEnabled(false);




        ArrayList<ILineDataSet> dataSets2 = new ArrayList<>();



        List<Entry> weight = weight();
        List<Entry> AvWeight = AvWeight();
        LineDataSet set3;
        LineDataSet set4;



        set3 = new LineDataSet(weight, "우리아이");
        set3.setColor(Color.parseColor("#44DDB7"));
        set3.setLineWidth(1.5f);
        set3.setDrawValues(false);
        set3.setDrawCircles(false);
        dataSets2.add(set3);


        set4 = new LineDataSet(AvWeight, "평균");
        set4.setColor(Color.parseColor("#4D44DDB7"));
        set4.setLineWidth(100);
        set4.setDrawValues(false);
        set4.setDrawCircles(false);
        //set4.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        dataSets2.add(set4);


        chart2.setTouchEnabled(false);
        chart2.setDrawGridBackground(false);
        chart2.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisLables));
        XAxis xAxis2 = chart2.getXAxis();
        xAxis2.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis2.setTextColor(Color.parseColor("#999999"));
        xAxis2.setTextSize(8);
        xAxis2.setLabelCount(6, true);
        xAxis2.setDrawGridLines(true);

        chart2.setBorderColor(Color.parseColor("#999999"));

        YAxis YAxis2 = chart2.getAxisLeft();
        YAxis2.setTextColor(Color.parseColor("#999999"));
        YAxis2.setTextSize(10);
        chart2.getAxisLeft().setLabelCount(6);

        YAxis yRAxis2 = chart2.getAxisRight();
        yRAxis2.setDrawLabels(false);
        yRAxis2.setDrawAxisLine(true);
        yRAxis2.setDrawGridLines(true);


        LineData data2 = new LineData(dataSets2);
        chart2.setData(data2);
        chart2.animateX(1500);
        chart2.invalidate();
        chart2.getLegend().setEnabled(false);
        chart2.getDescription().setEnabled(false);



        return rootView;
    }

private FloatingActionButton camera;
private BottomNavigationView navi;
    private List<Entry> height() {
        ArrayList<Entry> height = new ArrayList<>();

        height.add(new Entry(0, 83));
        height.add(new Entry(1, 85));
        height.add(new Entry(2, 86));
        height.add(new Entry(3, 88));
        height.add(new Entry(4, 89));
        height.add(new Entry(5, 90));


        /*height.add(new Entry(8, 93));
        height.add(new Entry(9, 95));
        height.add(new Entry(10, 96));
        height.add(new Entry(11, 98));
        height.add(new Entry(12, 99));*/
        return height;
    }
    private List<Entry> AvHeight(){
        ArrayList<Entry> AvHeight = new ArrayList<>();

        AvHeight.add(new Entry(0, 83));
        AvHeight.add(new Entry(1, 84));
        AvHeight.add(new Entry(2, 87));
        AvHeight.add(new Entry(3, 87));
        AvHeight.add(new Entry(4, 88));
        AvHeight.add(new Entry(5, 89));


        /*AvHeight.add(new Entry(8, 90));
        AvHeight.add(new Entry(9, 91));
        AvHeight.add(new Entry(10, 92));
        AvHeight.add(new Entry(11, 93));
        AvHeight.add(new Entry(12, 94));*/
        return  AvHeight;
    }

    private List<Entry> weight(){
        ArrayList<Entry> weight = new ArrayList<>();

        weight.add(new Entry(0, 23));
        weight.add(new Entry(1, 24));
        weight.add(new Entry(2, 26));
        weight.add(new Entry(3, 28));
        weight.add(new Entry(4, 31));
        weight.add(new Entry(5, 35));


        return  weight;
    }
    private List<Entry> AvWeight(){
        ArrayList<Entry> AvWeight = new ArrayList<>();

        AvWeight.add(new Entry(0, 22));
        AvWeight.add(new Entry(1, 24));
        AvWeight.add(new Entry(2, 25));
        AvWeight.add(new Entry(3, 27));
        AvWeight.add(new Entry(4, 30));
        AvWeight.add(new Entry(5, 34));

        return  AvWeight;
    }

    private LineChart chart;
    private LineChart chart2;


/*
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        navi=(BottomNavigationView)findViewById(R.id.nav_view);
        setContentView(R.layout.activity_record);
        chart = findViewById(R.id.linechart1);
        chart2 = findViewById(R.id.linechart2);
        ArrayList<Entry> entry1 = new ArrayList<>();
       ArrayList<Entry> entry2 = new ArrayList<>();
        ImageView imageView = (ImageView)findViewById(R.id.album1);
        ImageView imageView2 = (ImageView)findViewById(R.id.album2);
        camera =(FloatingActionButton)findViewById(R.id.camera);
        camera.bringToFront();

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        String[] xAxisLables = new String[]{"JAN","FEB", "MAR", "APR","MAY","JUN","   "};


        List<Entry> height = height();
        List<Entry> AvHeight = AvHeight();
        LineDataSet set1;
        LineDataSet set2;



       set1 = new LineDataSet(height, "우리아이");
        set1.setLineWidth(1.5f);
        set1.setColor(Color.parseColor("#FF8762"));
        set1.setDrawValues(false);
        set1.setDrawCircles(false);
        dataSets.add(set1);


      set2 = new LineDataSet(AvHeight, "평균");
        set2.setLineWidth(1.5f);
        set2.enableDashedLine(10, 6, 2 );
        set2.setColor(Color.parseColor("#FFFF8762"));
        set2.setDrawValues(false);
        set2.setDrawCircles(false);
        dataSets.add(set2);


        chart.setTouchEnabled(false);
        chart.setDrawGridBackground(false);
        chart.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisLables));
        chart.setMaxVisibleValueCount(90);
       // chart.setExtraLeftOffset(15);
        //chart.setExtraRightOffset(15);

        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(Color.parseColor("#999999"));
        xAxis.setTextSize(8);
        xAxis.setDrawGridLines(true);
        xAxis.setLabelCount(6, true);
       xAxis.setAxisLineColor(Color.parseColor("#999999"));
        xAxis.setAxisMaximum(5f);
        xAxis.setAxisMinimum(0f);

        //xAxis.setGranularity(5);


        chart.setBorderColor(Color.parseColor("#999999"));



        YAxis YAxis = chart.getAxisLeft();
        YAxis.setTextColor(Color.parseColor("#999999"));
        YAxis.setTextSize(8);
        YAxis.setLabelCount(6, true);
        YAxis.setGridColor(Color.parseColor("#999999"));

       YAxis yRAxis = chart.getAxisRight();
        yRAxis.setLabelCount(6, true);
        yRAxis.setDrawLabels(false);
        yRAxis.setDrawAxisLine(true);
        yRAxis.setDrawGridLines(true);


        LineData data = new LineData(dataSets);
        chart.setData(data);
        chart.animateX(1500);
        chart.invalidate();
        chart.getLegend().setEnabled(false);
        chart.getDescription().setEnabled(false);

        MyMarkerView mv = new MyMarkerView(this, R.layout.custom_marker_view);
        mv.setChartView(chart);

        ArrayList<ILineDataSet> dataSets2 = new ArrayList<>();



        List<Entry> weight = weight();
        List<Entry> AvWeight = AvWeight();
        LineDataSet set3;
        LineDataSet set4;



        set3 = new LineDataSet(weight, "우리아이");
        set3.setColor(Color.parseColor("#44DDB7"));
        set3.setLineWidth(1.5f);
        set3.setDrawValues(false);
        set3.setDrawCircles(false);
        dataSets2.add(set3);


        set4 = new LineDataSet(AvWeight, "평균");
        set4.setColor(Color.parseColor("#4D44DDB7"));
        set4.setLineWidth(100);
        set4.setDrawValues(false);
        set4.setDrawCircles(false);
        //set4.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        dataSets2.add(set4);


        chart2.setTouchEnabled(false);
        chart2.setDrawGridBackground(false);
        chart2.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisLables));
        XAxis xAxis2 = chart2.getXAxis();
        xAxis2.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis2.setTextColor(Color.parseColor("#999999"));
        xAxis2.setTextSize(8);
        xAxis2.setLabelCount(6, true);
        xAxis2.setDrawGridLines(true);

        chart2.setBorderColor(Color.parseColor("#999999"));

        YAxis YAxis2 = chart2.getAxisLeft();
        YAxis2.setTextColor(Color.parseColor("#999999"));
        YAxis2.setTextSize(10);
        chart2.getAxisLeft().setLabelCount(6);

        YAxis yRAxis2 = chart2.getAxisRight();
        yRAxis2.setDrawLabels(false);
        yRAxis2.setDrawAxisLine(true);
        yRAxis2.setDrawGridLines(true);


        LineData data2 = new LineData(dataSets2);
        chart2.setData(data2);
        chart2.animateX(1500);
        chart2.invalidate();
        chart2.getLegend().setEnabled(false);
        chart2.getDescription().setEnabled(false);

*/

       /* LineData chartData2 = new LineData();
        LineDataSet set3 = new LineDataSet(entry3, "우리아이");
        chartData2.addDataSet(set3);
        set3.setColor(Color.parseColor("#6Ec8B2"));
        set3.setLineWidth(1.5f);

        LineDataSet set4 = new LineDataSet(entry4, "평균");
        set4.setColor(Color.parseColor("#4D6Ec8B2"));
        set4.setLineWidth(100f);
        chartData2.addDataSet(set4);
        chart2.setData(chartData2);
        chart2.invalidate();
        set3.setDrawValues(false);
        set4.setDrawValues(false);
        set3.setDrawCircles(false);
        set4.setDrawCircles(false);



        chart.setDescription(null);
        chart2.setDescription(null);
        chart.getLegend().setEnabled(false);
        chart2.getLegend().setEnabled(false);

        YAxis YAxis2 = chart2.getAxisLeft();
        YAxis2.setTextColor(Color.parseColor("#999999"));
        YAxis2.setTextSize(10);

        YAxis yRAxis2 = chart2.getAxisRight();
        yRAxis2.setDrawLabels(false);

        chart2.setDrawBorders(true);
        chart2.setBorderColor(Color.parseColor("#999999"));
        chart2.setGridBackgroundColor(Color.parseColor("#999999"));*/

   // }
}


