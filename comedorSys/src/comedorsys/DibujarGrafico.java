/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comedorsys;

/**
 *
 * @author waita
 */
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Luis Marcos
 */
public class DibujarGrafico {
      /**
     * Crea un gráfico de barras y lo asigna al JPanel recibido
     * @param histograma histograma de frecuencias (int[256]).
     * @param jPanelHistograma JPanel donde el histograma será dibujado
     * @param colorBarras color de cuál será dibujado el histograma
     */
    public void crearHistograma(int[] histograma,JPanel jPanelHistograma,Color colorBarras, ArrayList<String> nombres) {
        //Creamos el dataSet y añadimos el histograma
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String serie = "Dias servidos";
        for (int i = 0; i < histograma.length; i++){
            dataset.addValue(histograma[i], serie, nombres.get(i));
        }
        //Creamos el chart
        JFreeChart chart = ChartFactory.createBarChart("Histograma de Frecuencia", "Platillos", "Cantidad de Días Repetidos",
                                    dataset, PlotOrientation.VERTICAL, true, true, false);
        //Modificamos el diseño del chart
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, colorBarras); //se podria usar siempre el mismo color jaja
        chart.setAntiAlias(true);
        chart.setBackgroundPaint(new Color(214, 217, 223)); 
        jPanelHistograma.setSize(300,470);
        //jPanelHistograma.setMaximumSize ( new Dimension ( 200, 470 ) );
        //jPanelHistograma.setMinimumSize ( new Dimension ( 400, 890 ) );
        jPanelHistograma.removeAll();
        jPanelHistograma.repaint();
        jPanelHistograma.setLayout(new java.awt.BorderLayout());
        jPanelHistograma.add(new ChartPanel(chart));
        jPanelHistograma.validate();    
        
    }
}                