# perf-measure
Simple java code performance measurement

Sample call:

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
