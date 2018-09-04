package com.rathish.java.lambda;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLambdaTest {

    @Test
    public void test_SortWithOutLambda(){
        List<Human> humanList = Lists.newArrayList(
                new Human("Ronaldo", 33),
                new Human("Messi", 31)
        );

        //Collection.sort, prior to Java 8
        Collections.sort(humanList, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        assertEquals("Messi", humanList.get(0).getName());

    }

    @Test
    public void test_SortWithLambda(){
        List<Human> humanList = Lists.newArrayList(
                new Human("Ronaldo", 33),
                new Human("Messi", 31)
        );

        // Collection object.sort since Java 8
        humanList.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));
        assertEquals("Messi", humanList.get(0).getName());
    }
}
