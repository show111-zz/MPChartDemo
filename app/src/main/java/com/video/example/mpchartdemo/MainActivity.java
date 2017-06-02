package com.video.example.mpchartdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BarChart day_fragment_bar_chart;
    private BarData mBarData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        day_fragment_bar_chart= (BarChart) findViewById(R.id.day_fragment_bar_chart);

        //getBarData(X轴坐标个数, X所对应的值也就是Y值)
//        mBarData = getBarData(24, 10);
//        showBarChart(day_fragment_bar_chart, mBarData);

    }

    /**
     *用来处理视图的方法
     */
    private void showBarChart(BarChart barChart, BarData barData) {
//        // 如果没有数据的时候，会显示这个，类似ListView的EmptyView
//        barChart.setNoDataTextDescription("You need to provide data for the chart.");
//
//        barChart.setData(barData); // 设置数据
//
//        barChart.setDrawBorders(false); //是否在折线图上添加边框
//
//        barChart.setDescription("数据描述");// 数据描述
//        barChart.setDescriptionPosition(100,20);//数据描述的位置
//        barChart.setDescriptionColor(Color.RED);//数据的颜色
//        barChart.setDescriptionTextSize(40);//数据字体大小
//
//        barChart.setDrawGridBackground(false); // 是否显示表格颜色
//        barChart.setGridBackgroundColor(Color.RED); // 表格的的颜色
//        //barChart.setBackgroundColor(Color.BLACK);// 设置整个图标控件的背景
//        barChart.setDrawBarShadow(false);//柱状图没有数据的部分是否显示阴影效果
//
//        barChart.setTouchEnabled(false); // 设置是否可以触摸
//        barChart.setDragEnabled(false);// 是否可以拖拽
//        barChart.setScaleEnabled(false);// 是否可以缩放
//        barChart.setPinchZoom(false);//y轴的值是否跟随图表变换缩放;如果禁止，y轴的值会跟随图表变换缩放
//
//        barChart.setDrawValueAboveBar(true);//柱状图上面的数值显示在柱子上面还是柱子里面
//
//        barChart.getXAxis().setDrawGridLines(false);//是否显示竖直标尺线
//        barChart.getXAxis().setLabelsToSkip(11);//设置横坐标显示的间隔
////        barChart.getXAxis().setLabelRotationAngle(20);//设置横坐标倾斜角度
////        barChart.getXAxis().setSpaceBetweenLabels(50);
//        barChart.getXAxis().setDrawLabels(true);//是否显示X轴数值
//        barChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);//设置X轴的位置 默认在上方
//
//        barChart.getAxisRight().setDrawLabels(false);//右侧是否显示Y轴数值
//        barChart.getAxisRight().setEnabled(false);//是否显示最右侧竖线
//        barChart.getAxisRight().setDrawAxisLine(true);
//        barChart.getAxisLeft().setDrawAxisLine(false);
//        barChart.getXAxis().setDrawAxisLine(true);
//
//
//        YAxisValueFormatter custom = new MyYAxisValueFormatter();//自定义Y轴文字样式
//        barChart.getAxisLeft().setValueFormatter(custom);
//
//        barChart.getLegend().setPosition(Legend.LegendPosition.RIGHT_OF_CHART);//设置比例图标的位置
//        barChart.getLegend().setDirection(Legend.LegendDirection.RIGHT_TO_LEFT);//设置比例图标和文字之间的位置方向
//        barChart.getLegend().setTextColor(Color.RED);
//
//        barChart.animateXY(2000,3000);
    }

    /**
     *用来处理数据的方法
     */
//    private BarData getBarData(int count, float range) {
//        ArrayList<String> xValues = new ArrayList<String>();
//        for (int i = 0; i < count; i++) {
//            xValues.add(i + "");
//        }
//
//        ArrayList<BarEntry> yValues = new ArrayList<BarEntry>();
//
//        for (int i = 0; i < count; i++) {
//            float value = (float) (Math.random() * range/*100以内的随机数*/) + 3;
//            yValues.add(new BarEntry(value, i));
//        }
//
//        // y轴的数据集合
//        BarDataSet barDataSet = new BarDataSet(yValues, "collection");
//
//        ArrayList<BarDataSet> barDataSets = new ArrayList<BarDataSet>();
//        barDataSets.add(barDataSet); // add the datasets
//
//        BarData barData = new BarData(xValues, barDataSet);
//
//        return barData;
//    }



}
