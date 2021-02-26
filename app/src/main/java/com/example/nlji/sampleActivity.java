package com.example.nlji;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;

public class sampleActivity extends AppCompatActivity {

    private List<Entry> record1() {
        ArrayList<Entry> record1 = new ArrayList<>();

        record1.add(new Entry(0, 23));
        record1.add(new Entry(1, 22));
        record1.add(new Entry(2, 21));
        record1.add(new Entry(3, 20));
        record1.add(new Entry(4, 22));
        record1.add(new Entry(5, 21));

        /*height.add(new Entry(8, 93));
        height.add(new Entry(9, 95));
        height.add(new Entry(10, 96));
        height.add(new Entry(11, 98));
        height.add(new Entry(12, 99));*/
        return record1;
    }

    private List<Entry> record2() {
        ArrayList<Entry>  record2 = new ArrayList<>();

        record2.add(new Entry(0, 79));
        record2.add(new Entry(1, 80));
        record2.add(new Entry(2, 81));
        record2.add(new Entry(3, 78));
        record2.add(new Entry(4, 78));
        record2.add(new Entry(5, 78));

        /*AvHeight.add(new Entry(8, 90));
        AvHeight.add(new Entry(9, 91));
        AvHeight.add(new Entry(10, 92));
        AvHeight.add(new Entry(11, 93));
        AvHeight.add(new Entry(12, 94));*/
        return  record2;
    }

    private List<Entry> record3() {
        ArrayList<Entry> record3 = new ArrayList<>();

        record3.add(new Entry(0, 15));
        record3.add(new Entry(1, 16));
        record3.add(new Entry(2, 17));
        record3.add(new Entry(3, 15));
        record3.add(new Entry(4, 14));
        record3.add(new Entry(5, 13));

        return record3;
    }

    private List<Entry> record4() {
        ArrayList<Entry> record4 = new ArrayList<>();

        record4.add(new Entry(0, 38));
        record4.add(new Entry(1, 38));
        record4.add(new Entry(2, 39));
        record4.add(new Entry(3, 40));
        record4.add(new Entry(4, 41));
        record4.add(new Entry(5, 39));
        return record4;
    }

    private List<Entry> record5() {
        ArrayList<Entry> record5 = new ArrayList<>();

        record5.add(new Entry(0, 4));
        record5.add(new Entry(1, 4));
        record5.add(new Entry(2, 5));
        record5.add(new Entry(3, 6));
        record5.add(new Entry(4, 5));
        record5.add(new Entry(5, 4));
        return record5;
    }

    private LineChart chart;
    private LineChart chart2;
    private LineChart chart3;
    private LineChart chart4;
    private LineChart chart5;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        chart = findViewById(R.id.linechart1);
        chart2 = findViewById(R.id.linechart2);
        chart3 = findViewById(R.id.linechart3);
        chart4 = findViewById(R.id.linechart4);
        chart5 = findViewById(R.id.linechart5);




        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        String[] xAxisLables = new String[]{"JAN", "FEB", "MAR", "APR", "MAY", "JUN", " "};


        List<Entry> record1 = record1();

        LineDataSet set1;



        set1 = new LineDataSet(record1, "우리아이");
        set1.setLineWidth(1.5f);
        set1.setColor(Color.parseColor("#FF8762"));
        set1.setDrawValues(false);
        set1.setDrawCircles(false);
        dataSets.add(set1);




        chart.setTouchEnabled(false);
        chart.setDrawGridBackground(false);
        chart.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisLables));



        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(Color.parseColor("#999999"));
        xAxis.setTextSize(8);
        xAxis.setDrawGridLines(true);
        xAxis.setLabelCount(6, true);
        xAxis.setAxisLineColor(Color.parseColor("#999999"));

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

        List<Entry> record2 = record2();
        LineDataSet set2;

        set2 = new LineDataSet(record2, "우리아이");
        set2.setColor(Color.parseColor("#FF8762"));
        set2.setLineWidth(1.5f);
        set2.setDrawValues(false);
        set2.setDrawCircles(false);
        dataSets2.add(set2);

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

        ArrayList<ILineDataSet> dataSets3 = new ArrayList<>();

        List<Entry> record3 = record3();

        LineDataSet set3;



        set3 = new LineDataSet(record3, "우리아이");
        set3.setLineWidth(1.5f);
        set3.setColor(Color.parseColor("#FF8762"));
        set3.setDrawValues(false);
        set3.setDrawCircles(false);
        dataSets3.add(set3);




        chart3.setTouchEnabled(false);
        chart3.setDrawGridBackground(false);
        chart3.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisLables));
        chart3.setMaxVisibleValueCount(90);


        XAxis xAxis3 = chart3.getXAxis();
        xAxis3.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis3.setTextColor(Color.parseColor("#999999"));
        xAxis3.setTextSize(8);
        xAxis3.setDrawGridLines(true);
        xAxis3.setLabelCount(6, true);
        xAxis3.setAxisLineColor(Color.parseColor("#999999"));


        chart3.setBorderColor(Color.parseColor("#999999"));

        YAxis YAxis3 = chart3.getAxisLeft();
        YAxis3.setTextColor(Color.parseColor("#999999"));
        YAxis3.setTextSize(8);
        YAxis3.setLabelCount(6, true);
        YAxis3.setGridColor(Color.parseColor("#999999"));

        YAxis yRAxis3 = chart3.getAxisRight();
        yRAxis3.setLabelCount(6, true);
        yRAxis3.setDrawLabels(false);
        yRAxis3.setDrawAxisLine(true);
        yRAxis3.setDrawGridLines(true);


        LineData data3 = new LineData(dataSets3);
        chart3.setData(data3);
        chart3.animateX(1500);
        chart3.invalidate();
        chart3.getLegend().setEnabled(false);
        chart3.getDescription().setEnabled(false);

        ArrayList<ILineDataSet> dataSets4 = new ArrayList<>();

        List<Entry> record4 = record4();

        LineDataSet set4;



        set4 = new LineDataSet(record4, "우리아이");
        set4.setLineWidth(1.5f);
        set4.setColor(Color.parseColor("#FF8762"));
        set4.setDrawValues(false);
        set4.setDrawCircles(false);
        dataSets4.add(set4);




        chart4.setTouchEnabled(false);
        chart4.setDrawGridBackground(false);
        chart4.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisLables));
        chart4.setMaxVisibleValueCount(90);


        XAxis xAxis4 = chart4.getXAxis();
        xAxis4.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis4.setTextColor(Color.parseColor("#999999"));
        xAxis4.setTextSize(8);
        xAxis4.setDrawGridLines(true);
        xAxis4.setLabelCount(6, true);
        xAxis4.setAxisLineColor(Color.parseColor("#999999"));


        chart4.setBorderColor(Color.parseColor("#999999"));

        YAxis YAxis4 = chart4.getAxisLeft();
        YAxis4.setTextColor(Color.parseColor("#999999"));
        YAxis4.setTextSize(8);
        YAxis4.setLabelCount(6, true);
        YAxis4.setGridColor(Color.parseColor("#999999"));

        YAxis yRAxis4 = chart4.getAxisRight();
        yRAxis4.setLabelCount(6, true);
        yRAxis4.setDrawLabels(false);
        yRAxis4.setDrawAxisLine(true);
        yRAxis4.setDrawGridLines(true);


        LineData data4 = new LineData(dataSets4);
        chart4.setData(data4);
        chart4.animateX(1500);
        chart4.invalidate();
        chart4.getLegend().setEnabled(false);
        chart4.getDescription().setEnabled(false);


        ArrayList<ILineDataSet> dataSets5 = new ArrayList<>();

        List<Entry> record5 = record5();

        LineDataSet set5;



        set5 = new LineDataSet(record4, "우리아이");
        set5.setLineWidth(1.5f);
        set5.setColor(Color.parseColor("#FF8762"));
        set5.setDrawValues(false);
        set5.setDrawCircles(false);
        dataSets5.add(set5);




        chart5.setTouchEnabled(false);
        chart5.setDrawGridBackground(false);
        chart5.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisLables));
        chart5.setMaxVisibleValueCount(90);


        XAxis xAxis5 = chart5.getXAxis();
        xAxis5.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis5.setTextColor(Color.parseColor("#999999"));
        xAxis5.setTextSize(8);
        xAxis5.setDrawGridLines(true);
        xAxis5.setLabelCount(6, true);
        xAxis5.setAxisLineColor(Color.parseColor("#999999"));


        chart5.setBorderColor(Color.parseColor("#999999"));

        YAxis YAxis5 = chart5.getAxisLeft();
        YAxis5.setTextColor(Color.parseColor("#999999"));
        YAxis5.setTextSize(8);
        YAxis5.setLabelCount(6, true);
        YAxis5.setGridColor(Color.parseColor("#999999"));

        YAxis yRAxis5 = chart5.getAxisRight();
        yRAxis5.setLabelCount(6, true);
        yRAxis5.setDrawLabels(false);
        yRAxis5.setDrawAxisLine(true);
        yRAxis5.setDrawGridLines(true);


        LineData data5 = new LineData(dataSets5);
        chart5.setData(data5);
        chart5.animateX(1500);
        chart5.invalidate();
        chart5.getLegend().setEnabled(false);
        chart5.getDescription().setEnabled(false);

    }
}
