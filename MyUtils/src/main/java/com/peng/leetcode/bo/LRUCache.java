package com.peng.leetcode.bo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author peng.wang
 * @Description LRU缓存
 * @createTime 2020/9/11
 */
public class LRUCache {

    int capacity;
    LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return cache.size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}