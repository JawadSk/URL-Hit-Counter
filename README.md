# URL-Hit-Counter

## Frameworks and Language

* Spring Boot and Java

## Model

### UrlHit

* UserName
* HitCounter

## DataFlow

### End Points / Controllers

#### api/v1/visitor-count-app/count
* @GetMapping("count")
  public String getHitCount() {
    return urlHitService.getIncreaseVisitor();
}

#### api/v1/visitor-count-app/count

* @GetMapping("username/{username}/count")
public UrlHit getVisitorHitCount(@PathVariable String username) {
    return urlHitService.getVisiterHitCount(username);
}

## Services

#### For counting visits
*public String getIncreaseVisitor() {
    return "visitors : " + urlHitDao.getIncreaseVisitor();
}

#### For counting visits for specific user
* public UrlHit getVisiterHitCount(String username) {
    return new UrlHit(username, urlHitDao.getVisitorHitCounter(username));
}

## Repository

#### For counting visits
* public int getIncreaseVisitor() {
    data.put("unknown", data.getOrDefault("unknown", 0) + 1);
    return data.get("unknown");
}

#### For counting visits of a specific user
* public Integer getVisitorHitCounter(String username) {
    data.put(username, data.getOrDefault(username, 0) + 1);
    return data.get(username);
}

## Database

#### I haven't used any Database in this project yet. But for data storing I have used Collections.

* private HashMap<String, Integer> data;

## Datastructure

* HashMap<>

## Summary

This API is a Spring Boot project that is about count the UrlHit and also for a specific user.
