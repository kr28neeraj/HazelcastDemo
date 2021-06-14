package com.cs.map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import java.util.Map;

/**
 *
 * This example demo the key-value storage provided by Hazelcast maps.
 * After running the example use the below query to verify in hazelcast console if needed.
 * hazelcast[default] > ns capitals
 * namespace: capitals
 *
 * hazelcast[capitals] > m.get GB
 * London
 */

public class HazelcastMapExample {
  public static void main(String[] args) {
    HazelcastInstance hz = Hazelcast.newHazelcastInstance();

    Map<String, String> capitals = hz.getMap("capitals");
    capitals.put("GB", "London");
    capitals.put("FR", "Paris");
    capitals.put("US", "Washington DC");
    capitals.put("AU", "Canberra");

    System.err.println(
      "Known capital cities: " + capitals.size());

    System.err.println(
      "Capital city of GB: " + capitals.get("GB"));



  }
}