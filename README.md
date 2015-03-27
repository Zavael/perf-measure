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

Results in log:

2015-03-27[INFO]...DefaultMeasure <init>: global.method measurement starts 
2015-03-27[INFO]...DefaultMeasure <init>: inline.loop.method.0 measurement starts 
2015-03-27[INFO]...DefaultMeasure stop: ====================================== 
2015-03-27[INFO]...DefaultMeasure stop: inline.loop.method.0 : time spend: 30ms 
2015-03-27[INFO]...DefaultMeasure stop: ====================================== 
2015-03-27[INFO]...DefaultMeasure <init>: inline.loop.method.1 measurement starts 
2015-03-27[INFO]...DefaultMeasure stop: ====================================== 
2015-03-27[INFO]...DefaultMeasure stop: inline.loop.method.1 : time spend: 30ms 
2015-03-27[INFO]...DefaultMeasure stop: ====================================== 
2015-03-27[INFO]...DefaultMeasure <init>: inline.loop.method.2 measurement starts 
2015-03-27[INFO]...DefaultMeasure stop: ====================================== 
2015-03-27[INFO]...DefaultMeasure stop: inline.loop.method.2 : time spend: 30ms 
2015-03-27[INFO]...DefaultMeasure stop: ====================================== 
2015-03-27[INFO]...DefaultMeasure stop: ====================================== 
2015-03-27[INFO]...DefaultMeasure stop: global.method : time spend: 158ms 
2015-03-27[INFO]...DefaultMeasure stop: ====================================== 
