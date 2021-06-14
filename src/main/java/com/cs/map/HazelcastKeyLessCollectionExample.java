package com.cs.map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

/**
 *  Hazelcast provide number of other collections for keyless groups of objects.
 *  Example of these distributed versions of collections sets and lists
 *
 */
public class HazelcastKeyLessCollectionExample {

    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Map<String, String> capitals = hz.getMap("capitals");
        Set<String> cities = hz.getSet("cities");
        cities.addAll((Collection<? extends String>) capitals.values());

        cities.add("London");
        cities.add("Rome");
        cities.add("New York");

        List<String> countries = hz.getList("countries");
        countries.addAll((java.util.Collection<? extends String>) capitals.keySet());
        countries.add("CA");
        countries.add("DE");
        countries.add("GB"); // duplicate entry


        cities.stream().forEach( i-> System.out.println(i));
        countries.stream().forEach(x-> System.out.println(x));
    }
}


/**
 *
 * Hazlecast console output example
 *
 *  hazelcast[default] > ns cities
 *  namespace: cities
 *  hazelcast[cities] > s.iterator
 *  1 Washington DC
 *  2 London
 *  3 Canberra
 *  4 New York
 *  5 Rome
 *  6 Paris
 *
 * hazelcast[cities] > ns countries
 * namespace: countries
 * hazelcast[countries] > l.iterator
 * 1 AU
 * 2 US
 * 3 FR
 * 4 GB
 * 5 CA
 * 6 DE
 * 7 GB
 *
 */
