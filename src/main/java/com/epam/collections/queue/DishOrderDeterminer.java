package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer>queue = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.offer(i);
        }

        List<Integer>list = new ArrayList<>();
        while (!queue.isEmpty()){
            for (int i = 1; i <= everyDishNumberToEat; i++) {
                 if(i==everyDishNumberToEat){
                     list.add(queue.poll());
                 }else {
                     queue.offer(queue.poll());
                 }
            }
        }
        return list;
    }
}
