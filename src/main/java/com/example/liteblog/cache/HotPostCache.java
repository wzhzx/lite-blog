package com.example.liteblog.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HotPostCache {

    @Scheduled(fixedRate = 1000 * 60 * 60 * 1)
    public void hotPostSchedule (){

    }
}

public class