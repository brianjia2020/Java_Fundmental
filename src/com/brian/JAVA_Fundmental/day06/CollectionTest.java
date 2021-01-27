package com.brian.JAVA_Fundmental.day06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Test about Collection common method
 * 1. when add custom Object class, have to rewrite equals method
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(456);
        coll.add(false);
        coll.add(new Person("Jerry",20));
        //contains
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));

        //1.contains
        //false --> have to rewrite equals method
        //when comparing, collection will use equals method to compare if it is the same
        System.out.println(coll.contains(new Person("Jerry",20)));

        //2.containsAll
        //containsAll: check if all elements are inside the coll
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(456);
        coll.add(false);
        coll.add(new Person("Jerry",20));

        //3. remove
        boolean remove = coll.remove(123);
        System.out.println(remove);
        System.out.println(coll);

        boolean jerry = coll.remove(new Person("Jerry", 20));
        System.out.println(jerry);
        System.out.println(coll);

        //4. removeAll
        //remove all elements in coll2 from coll1
        Collection coll1 = Arrays.asList(456);
        coll.removeAll(coll1);
        System.out.println(coll);

    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(456);
        coll.add(false);
        coll.add(new Person("Jerry",20));

        //5. retainAll
        boolean b = coll.retainAll(Arrays.asList(123, 456));
        System.out.println(b);

        //6. equals
        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(123);
        coll2.add(456);
        coll2.add(new String("Tom"));
        coll2.add(456);
        coll2.add(false);
        coll2.add(new Person("Jerry",20));
        System.out.println(coll.equals(coll2));
    }

    @Test
    public void test4(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(456);
        coll.add(false);
        coll.add(new Person("Jerry",20));

        //7. hashCode(): return current hash code
        int z = coll.hashCode();
        System.out.println(z);

        //8.toArray(): cast into array
        Object[] objects = coll.toArray();
        for(int i=0;i<objects.length;i++) System.out.println(objects[i]);

        //8.5 array to List<>
        List<String> strings = Arrays.asList("AAA", "BBB", "CCC");
        System.out.println(strings);

        //9. iterator(): return Iterator class used to loop over the collection

    }
}
