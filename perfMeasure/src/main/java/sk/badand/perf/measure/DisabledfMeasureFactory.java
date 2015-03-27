/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.badand.perf.measure;

public class DisabledfMeasureFactory extends AbstractPerfMeasureFactory {

    @Override
    public Measure getMeasure() {
        return new DisabledMeasure();
    }

    public class DisabledMeasure implements Measure {

        public DisabledMeasure() {
        }

        @Override
        public long stop(String methodName) {
            return -1;
        }
    }
}
