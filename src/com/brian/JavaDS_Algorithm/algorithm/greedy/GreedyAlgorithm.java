package com.brian.JavaDS_Algorithm.algorithm.greedy;

import java.util.*;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        //create a array of broadcasting station
        Map<String, Set<String>> broadcasts = new HashMap<>();
        broadcasts.putIfAbsent("K1",new HashSet<>());
        broadcasts.get("K1").add("beijing");
        broadcasts.get("K1").add("shanghai");
        broadcasts.get("K1").add("tianjin");
        broadcasts.putIfAbsent("K2",new HashSet<>());
        broadcasts.get("K2").add("guangzhou");
        broadcasts.get("K2").add("beijing");
        broadcasts.get("K2").add("shenzhen");
        broadcasts.putIfAbsent("K3",new HashSet<>());
        broadcasts.get("K3").add("chengdu");
        broadcasts.get("K3").add("shanghai");
        broadcasts.get("K3").add("shenzhen");
        broadcasts.putIfAbsent("K4",new HashSet<>());
        broadcasts.get("K4").add("shanghai");
        broadcasts.get("K4").add("tianjin");
        broadcasts.putIfAbsent("K5",new HashSet<>());
        broadcasts.get("K5").add("hangzhou");
        broadcasts.get("K5").add("dalian");
        Set<String> allAreas = new HashSet<>();
        allAreas.add("beijing");
        allAreas.add("shanghai");
        allAreas.add("tianjin");
        allAreas.add("guangzhou");
        allAreas.add("shenzhen");
        allAreas.add("chengdu");
        allAreas.add("hangzhou");
        allAreas.add("dalian");
        System.out.println(getCoverage(broadcasts,allAreas));


    }

    public static List<String> getCoverage(Map<String,Set<String>> broadcasts, Set<String> allAreas){
        //create an arraylist to store the collection of broadcasting station
        ArrayList<String> selects = new ArrayList<>();
        //define a temporary collection and store the
        Set<String> tempSet = new HashSet<>();

        String maxKey=null;

        //define a maxKey, store the max index of the broadcast station which can cover the most areas
        //if maxKey is not null, then add to the selects arraylist
        while (allAreas.size()!=0){//if allAreas are not, it means not all has been covered.
            //every loop starts, maxKey = null
            maxKey = null;
            for(String k: broadcasts.keySet()){
                tempSet.clear();
                tempSet.addAll(broadcasts.get(k));
                //calculate the tempSet and allAreas common set, reassign the common set to tempSet
                tempSet.retainAll(allAreas);
                if(tempSet.size()>0&&(maxKey==null||tempSet.size()>broadcasts.get(maxKey).size())){
                    maxKey = k;
                }
            }
            //if maxKey is not null,
            if(maxKey!=null){
                selects.add(maxKey);
                //clear the areas from allAreas for maxKey
                allAreas.removeAll(broadcasts.get(maxKey));
            }
        }
        return selects;
    }
}
