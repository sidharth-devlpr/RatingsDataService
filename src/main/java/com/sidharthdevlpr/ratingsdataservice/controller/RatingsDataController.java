package com.sidharthdevlpr.ratingsdataservice.controller;

import com.sidharthdevlpr.ratingsdataservice.domain.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataController {

    @GetMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable String movieId){
        return new Rating(movieId,4);
    }
}
