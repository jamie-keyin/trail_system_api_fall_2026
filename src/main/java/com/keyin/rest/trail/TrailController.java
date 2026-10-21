package com.keyin.rest.trail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TrailController {
    @Autowired
    private TrailService trailService;

    @PostMapping("/trail")
    public Trail createTrail(@RequestBody Trail trail) {
        return trailService.createTrail(trail);
    }
}
