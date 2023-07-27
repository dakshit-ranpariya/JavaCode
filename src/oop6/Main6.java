package oop6;

public class Main6 {
    public static void main(String[] args){
        Movie m1 = new Movie("Golmaal", "Dharma");
        Movie m2 = new Movie("Housefull", "ABC");
        Movie m3 = new Movie("Movie3", "XYZ", "2 Star");


        Movie[] movies = new Movie[3];
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;

        Movie.get5StarMovies(movies);
    }
}
class Movie{
    private String title;
    private String studio;
    private String rating;



    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "5 Star";
    }

    public static void get5StarMovies(Movie[] movies) {
        for(int i=0; i< movies.length; i++){
            if(movies[i].rating.equals("5 Star")){
                System.out.println(movies[i].title + ", " + movies[i].studio + ", " + movies[i].rating);
            }
        }
    }
}
