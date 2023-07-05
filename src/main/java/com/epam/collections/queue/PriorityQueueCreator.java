package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> list = new PriorityQueue<>((s1,s2)->s2.compareTo(s1));
        list.addAll(firstList);
        list.addAll(secondList);
        return list;

    }
}
