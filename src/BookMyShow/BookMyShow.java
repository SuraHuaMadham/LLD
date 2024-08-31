package BookMyShow;

import BookMyShow.Enum.City;
import BookMyShow.Enum.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    MovieController movieController;
    TheaterController theaterController;

    public BookMyShow() {
        movieController = new MovieController();
        theaterController = new TheaterController();
    }

    public static void main(String args[]){
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialize();
        //user1
        bookMyShow.createBooking(City.Bangalore, "Batman");
        //user2
        bookMyShow.createBooking(City.Bangalore, "Batman");


    }

    void initialize(){
        createMovies();
        createTheatres();
    }

    private void createMovies(){
        Movie batman = new Movie();
        batman.setMovieId(1);
        batman.setDuration(120);
        batman.setName("Batman");

        Movie spider = new Movie();
        spider.setName("SpiderMan");
        spider.setDuration(100);
        spider.setMovieId(2);

        movieController.addMovie(City.Bangalore,batman);
        movieController.addMovie(City.Delhi,batman);
        movieController.addMovie(City.Bangalore,spider);
        movieController.addMovie(City.Delhi,batman);

    }

    private void createTheatres(){
        Movie batmanMovie = movieController.getMovie("Batman");
        Movie spiderMovie = movieController.getMovie("SpiderMan");

        Theatre inox = new Theatre();
        inox.setTheatreId(1);
        inox.setC(City.Bangalore);
        inox.setScreen(createScreen());
        Show inoxMShows = createShow(1,inox.getScreen().get(0),batmanMovie,8);
        Show inoxEShows = createShow(2,inox.getScreen().get(0),spiderMovie,16);
        List<Show> inoxShows = new ArrayList<>();
        inoxShows.add(inoxEShows);
        inoxShows.add(inoxMShows);
        inox.setShow(inoxShows);

        Theatre pvr = new Theatre();
        pvr.setTheatreId(1);
        pvr.setC(City.Bangalore);
        pvr.setScreen(createScreen());
        Show pvrMShows = createShow(1,inox.getScreen().get(0),batmanMovie,8);
        Show pvrEShows = createShow(2,inox.getScreen().get(0),spiderMovie,16);
        List<Show> pvrShows = new ArrayList<>();
        pvrShows.add(pvrEShows);
        pvrShows.add(pvrMShows);
        pvr.setShow(pvrShows);

        theaterController.addTheatre(City.Bangalore,inox);
        theaterController.addTheatre(City.Delhi,pvr);
    }

    private List<Screen> createScreen(){
       List<Screen> screens = new ArrayList<>();
       Screen s1 = new Screen();
       s1.setScreenId(1);
       s1.setSeats(createSeats());
       screens.add(s1);
       return  screens;
    }

    private Show createShow(int showId, Screen screen, Movie movie, int showStartTime){
        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime);
        return show;
    }

    private List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();

        for(int i=0;i<30;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setS(SeatCategory.Silver);
            seats.add(seat);
        }
        for(int i=31;i<80;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setS(SeatCategory.Gold);
            seats.add(seat);
        }
        for(int i=81;i<=100;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setS(SeatCategory.Diamond);
            seats.add(seat);
        }
        return seats;
    }

    private void createBooking(City userCity,String movieName){
        List<Movie> movies = movieController.getMovieByCity(userCity);
        Movie interested = null;
        for(Movie m : movies){
            if(m.getName().equals(movieName)){
                interested = m;
            }
        }

        Map<Theatre,List<Show>> theatreVsShow = theaterController.getAllShow(interested,userCity);
        Map.Entry<Theatre,List<Show>> entry = theatreVsShow.entrySet().iterator().next();
        List<Show> runningShow = entry.getValue();
        Show inrestedShow = runningShow.get(0);

        int seatNumber = 40;
        List<Integer> bookedSeats = inrestedShow.getBookedSeatIds();
        if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for(Seat screenSeat: inrestedShow.getScreen().getSeats()){
                if(screenSeat.getSeatId() == seatNumber){
                    myBookedSeats.add(screenSeat);

                }
                booking.setBooked(myBookedSeats);
                booking.setShow(inrestedShow);
            }

        }else{
            System.out.println("Seat already booked");
            return;
        }
        System.out.println("Booking Successful");

    }

}
