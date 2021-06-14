package com.cs.fifo;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.concurrent.BlockingQueue;

/**
 * Hazelcast provides is a queue based on the first-in first-out (FIFO) method. This provides us with a mechanism to offer objects to the back of a queue before retrieving them from the front. Such a structure will be incredibly useful
 * if we have a number of tasks that have to be individually handled by a number of client workers
 * A FIFO queue should only provide an individual item to a single consumer irrespective of the number of consumers connected to the queue.
 */
public class SimpleQueueExample {
    public static void main(String[] args) throws Exception {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();

        BlockingQueue<String> arrivals = hz.getQueue("arrivals");

        while (true) {
            String arrival = arrivals.take();

            System.err.println(
                    "New arrival from: " + arrival);
        }
    }
}

/**
 * hazelcast[countries] > ns arrivals
 * namespace: arrivals
 * hazelcast[arrivals] > q.offer Heathrow
 * true
 * hazelcast[arrivals] > q.offer JFK
 * true
 *
 * New arrival from: Heathrow
 * New arrival from: JFK
 *
 *
 *
 *
 */