package com.jawad.URLHitCounter.service;

import com.jawad.URLHitCounter.model.UrlHit;
import com.jawad.URLHitCounter.repository.UrlHitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {

    @Autowired
    UrlHitDao urlHitDao;

    public String getIncreaseVisitor() {
        return "visitors : " + urlHitDao.getIncreaseVisitor();
    }

    public UrlHit getVisiterHitCount(String username) {
        return new UrlHit(username, urlHitDao.getVisitorHitCounter(username));
    }
}
