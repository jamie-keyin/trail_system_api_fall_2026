package com.keyin.rest.trail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TrailController {
    @Autowired
    private TrailService trailService;

    @GetMapping("/trails")
    public List<Trail> getAllTrails() {
        return trailService.getAllTrails();
    }

    @PostMapping("/trails")
    public Trail createTrail(@RequestBody Trail trail) {
        return trailService.createTrail(trail);
    }
}
