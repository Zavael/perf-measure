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
public class SampleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Measure measure1 = PerfMeasure.getMeasure("global.method");
        //some long operation
        Thread.sleep(50);

        Measure measure2;
        for (int i = 0; i < 3; i++) {
            measure2 = PerfMeasure.getMeasure("inline.loop.method." + i);
            //another long operation in loop
            Thread.sleep(30);
            
            measure2.stop();
        }
        Thread.sleep(10);
        
        measure1.stop();
    }

}
