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
        List<Rating> sidharthsList = Arrays.asList(
                new Rating("72",4),
                new Rating("73",3)
        );
        List<Rating> kaushiksList = Arrays.asList(
                new Rating("1",4),
                new Rating("2",5)
        );
        if (userId.equals("sidharth")){
            UserRating userRating = new UserRating();
            userRating.setUserRating(sidharthsList);
            return userRating;
        } else if (userId.equals("kaushik")) {
            UserRating userRating = new UserRating();
            userRating.setUserRating(kaushiksList);
            return userRating;
        }
        else {
            return new UserRating();
        }
    }
}
