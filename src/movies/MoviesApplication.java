package movies;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();

        int userinput;
        boolean stopper = false;

        while(!stopper) {
            System.out.printf("Would you like to view movies by category or all movies?%n0: Quit%n1: By Category%n2: All Movies%n");
            Input input = new Input();
            userinput = input.getInt(0, 2);

            switch (userinput) {
                case 1:
                    getMovieByCat(movies, input);
                    stopper = true;
                    break;
                case 2:
                    allMovies(movies);
                    stopper = true;
                    break;
                case 0:
                    System.out.printf("%nSee you next time!%n");
                    stopper = true;
                    break;
                default:
                    System.out.printf("%nPlease enter a valid input%n");
                    userinput = input.getInt(0,2);
                    break;

            }
        }
    }

    //function to get all movies
    public static void allMovies(Movie[] movies) {
        for (Movie movie : movies) {
            if (movie.getCategory().equals(movie.getCategory())) {
                System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
            }
        }
    }

//function to get user input of what category they would like to view
    public static void getMovieByCat(Movie[] movies, Input input){
        System.out.printf("What category would you like to view?%n1: animated%n2: drama%n3: horror%n4: scifi");
        int userCat = input.getInt(1,4);
        String category = getCategories(userCat);

        for(Movie movie : movies) {
            if(movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s-%s%n", movie.getName(), movie.getCategory());
            }
        }
    }

    //function to get movies by categories
    public static String getCategories(int catSelected){
    String category;
//        Scanner myScanner = new Scanner(System.in);
//        int userInput = myScanner.nextInt();
//        boolean stopper = false;
//        while(!stopper) {
//            if (userInput == 1) {
//                System.out.printf("What category would you like to view?%n1: animated%n2: drama%n3: horror%n4: scifi");
                switch (catSelected){
                    case 1:
                        category = "animated";
                        break;
                    case 2:
                        category = "drama";
                        break;
                    case 3:
                        category = "horror";
                        break;
                    case 4:
                        category = "scifi";
                        break;
                    default:
                        category = "";
                        break;
                }
                return category;
        }
}
