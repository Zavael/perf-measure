/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.badand.perf.measure;

/**
 *
 * @author abadinka <andrej.badinka@interway.sk>
 */
public class PerfMeasure {

    private static final AbstractPerfMeasureFactory measureFactory;

    //TODO switch factories according to some param
    //TODO try to support annotation
    static {
        measureFactory = new DefaultMeasureFactory();
    }
    
    public static Measure getMeasure(String name){
        return measureFactory.getNewMeasure(name);
    }
}
