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
    public DefaultMeasure getNewMeasure(String name) {
        return new DefaultMeasure(name);
    }

    public static class DefaultMeasure implements Measure {

        private static final Logger LOG = Logger.getLogger(DefaultMeasure.class.getName());

        protected long startTime;
        private final String name;

        DefaultMeasure(String name) {
            LOG.log(Level.INFO, "{0} measurement starts", name);
            startTime = System.currentTimeMillis();
            this.name = name;
        }

        @Override
        public long stop() {
            long duration = System.currentTimeMillis() - startTime;
            LOG.log(Level.INFO, "======================================");
            LOG.log(Level.INFO, "{1} : time spend: {0}ms", new Object[]{duration, name});
            LOG.log(Level.INFO, "======================================");
            return duration;
        }
    }
}
