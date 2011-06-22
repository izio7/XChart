/**
 * Copyright 2011 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.xcharts.example;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.xeiam.xcharts.Chart;
import com.xeiam.xcharts.JChartPanel;
import com.xeiam.xcharts.series.Series;
import com.xeiam.xcharts.series.SeriesMarker;

/**
 * Demonstrated/Tests plotting horizontal and vertical lines
 * 
 * @author timmolter
 */
public class SwingChart4 {

    private static void createAndShowGUI() {

        // generates linear data
        double[] yData1 = new double[] { 0.0, 0.0, 0.0, -10.0, 15.0, 15.0 };

        // Create and set up the window.
        JFrame frame = new JFrame("XChart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);

        // Create Chart
        Chart chart = new Chart(800, 600);

        // Customize Chart
        chart.setChartTitle("Sample Chart");
        chart.setXAxisTitle("X");
        chart.setYAxisTitle("Y");
        chart.setChartTitleVisible(false);
        chart.setChartLegendVisible(false);
        chart.setAxisTitlesVisible(false);

        // Series
        Series series1 = chart.addSeries("y=0", null, yData1);
        series1.setMarker(SeriesMarker.NONE);

        // Swing
        JPanel chartPanel = new JChartPanel(chart);

        // add the panel to the content pane
        frame.getContentPane().add(chartPanel, BorderLayout.CENTER);

        // Display the window
        frame.pack();
        frame.setLocationRelativeTo(null); // centers on screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
