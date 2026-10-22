package com.keyin.rest.trail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrailService {

    @Autowired
    private TrailRepository trailRepository;

    public Trail createTrail(Trail trail) {
        return trailRepository.save(trail);
    }

    public List<Trail> getAllTrails() {
        return (List<Trail>) trailRepository.findAll();
    }
}
