/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.badand.perf.measure;

public class DisabledfMeasureFactory extends AbstractPerfMeasureFactory {

    @Override
    public Measure getNewMeasure(String name) {
        return new DisabledMeasure(name);
    }

    public class DisabledMeasure implements Measure {

        public DisabledMeasure(String name) {
        }

        @Override
        public long stop() {
            return -1;
        }
    }
}
