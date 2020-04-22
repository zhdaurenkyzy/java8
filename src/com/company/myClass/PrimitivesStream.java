package com.company.myClass;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitivesStream {

    public void getCreatePrimitives(){
        IntStream intStreamByRange = IntStream.range(1, 10);
        LongStream longStream = LongStream.rangeClosed(2, 20);
        DoubleStream doubleStream = DoubleStream.of(1, 2, 3, 4); // no method range/rangeClosed for DoubleStream
    }

    public void getConverterStream(){
        DoubleStream doubleStream = IntStream.of(1, 2, 3)
                .asLongStream()
                .asDoubleStream();
    }

    public void getStreamToArray(){
        int[] intArr = IntStream.range(1, 7).toArray();
        long[] longArr = LongStream.rangeClosed(20, 35).toArray();
        double[] doubleArr = DoubleStream.of(20, 21, 22).toArray();
    }

    public void getSum(){
        int sum = IntStream.of(1, 2, 3, 4, 5).sum();
        System.out.println(sum);
    }

    public void getAverage(){
        OptionalDouble average = IntStream.of(1, 2)
                .average();
        System.out.println(average.getAsDouble());
    }
}
