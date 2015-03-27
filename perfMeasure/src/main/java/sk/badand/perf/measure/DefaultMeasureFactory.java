/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.badand.perf.measure;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultMeasureFactory extends AbstractPerfMeasureFactory {

    @Override
    public DefaultMeasure getMeasure() {
        return new DefaultMeasure();
    }

    public static class DefaultMeasure implements Measure {

        private static final Logger LOG = Logger.getLogger(DefaultMeasure.class.getName());

        protected long startTime;

        DefaultMeasure() {
            LOG.log(Level.INFO, "====================================== measurement starts");
            startTime = System.currentTimeMillis();
        }

        @Override
        public long stop(String methodName) {
            long duration = System.currentTimeMillis() - startTime;
            LOG.log(Level.INFO, "======================================");
            LOG.log(Level.INFO, "{1} : time spend: {0}ms", new Object[]{duration, methodName});
            LOG.log(Level.INFO, "======================================");
            return duration;
        }
    }
}
