package BookMyShow;

import BookMyShow.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovie;
    List<Movie> allMovie;

    public MovieController() {
        cityVsMovie = new HashMap<>();
        allMovie = new ArrayList<>();
    }

    void addMovie(City c,Movie m){
        allMovie.add(m);
        List<Movie> movie = cityVsMovie.getOrDefault(c,new ArrayList<>());
        movie.add(m);
        cityVsMovie.put(c,movie);
    }

    Movie getMovie(String movieName){
        for(Movie m: allMovie){
            if((m.getName().equals(movieName))){
                return m;
            }
        }
        return null;
    }

    List<Movie> getMovieByCity(City c){
        return cityVsMovie.get(c);
    }



    //Other CRUD Operations
}

