package com.brian.JAVA_Fundmental.day06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * loop over Collection using Iterator interface
 */
public class IteratorTest {
    @Test
    public void test(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(456);
        coll.add(false);
        coll.add(new Person("Jerry",20));

        Iterator iterator = coll.iterator();
        System.out.println(iterator.next());
    }
}
