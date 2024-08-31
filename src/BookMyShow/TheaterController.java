package BookMyShow;

import BookMyShow.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatre;

    public TheaterController() {
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }

    void addTheatre(City c,Theatre m){
        allTheatre.add(m);
        List<Theatre> movie = cityVsTheatre.getOrDefault(c,new ArrayList<>());
        movie.add(m);
        cityVsTheatre.put(c,movie);
    }

    Map<Theatre, List<Show>> getAllShow(Movie m, City C){
        Map<Theatre, List<Show>> theatreVsShow = new HashMap<>();
        List<Theatre> theatres = cityVsTheatre.get(C);

        for(Theatre t: theatres){

            List<Show> allGivenShows = new ArrayList<>();
            List<Show> ts = t.getShow();

            for(Show s: ts){
                if(s.movie.getMovieId()==m.getMovieId()){
                    allGivenShows.add(s);
                }
            }
            if(!allGivenShows.isEmpty()){
                theatreVsShow.put(t,allGivenShows);
            }
        }
return  theatreVsShow;
    }

    //Other CRUD Operations
}

