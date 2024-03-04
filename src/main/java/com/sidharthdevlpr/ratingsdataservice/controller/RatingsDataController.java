package com.sidharthdevlpr.ratingsdataservice.controller;

import com.sidharthdevlpr.ratingsdataservice.domain.Rating;
import com.sidharthdevlpr.ratingsdataservice.domain.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataController {

   /* @GetMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable String movieId){
        return new Rating(movieId,4);
    }*/
    @GetMapping("/{userId}")
    public UserRating getMovieRatings(@PathVariable String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("101",4),
                new Rating("102",3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
