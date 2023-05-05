package com.jawad.URLHitCounter.model;

public class UrlHit {

    private String username;
    private Integer hitCount;

    public UrlHit(String username, Integer hitCount) {
        super();
        this.username = username;
        this.hitCount = hitCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getHitCount() {
        return hitCount;
    }

    public void setHitCount(Integer count) {
        this.hitCount = count;
    }
}
