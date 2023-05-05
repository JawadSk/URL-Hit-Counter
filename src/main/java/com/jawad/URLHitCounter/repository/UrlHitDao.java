package com.jawad.URLHitCounter.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UrlHitDao {

    private HashMap<String, Integer> data;
    int visitors;

    public UrlHitDao() {
        super();
        this.data = new HashMap<>();
    }

    public int getIncreaseVisitor() {
        data.put("unknown", data.getOrDefault("unknown", 0) + 1);
        return data.get("unknown");
    }

    public Integer getVisitorHitCounter(String username) {
        data.put(username, data.getOrDefault(username, 0) + 1);
        return data.get(username);
    }
}
