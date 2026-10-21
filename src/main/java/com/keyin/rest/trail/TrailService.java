package com.keyin.rest.trail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;

@Service
public class TrailService {

    @Autowired
    private TrailRepository trailRepository;

    public Trail createTrail(Trail trail) {
        return trailRepository.save(trail);
    }
}
