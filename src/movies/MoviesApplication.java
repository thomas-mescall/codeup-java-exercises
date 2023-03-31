package movies;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        Input input = new Input();
        System.out.printf("Would you like to view movies by category or all movies?%n0: Quit%n1: By Category%n2: All Movies");
           int userinput = input.getInt(0,2);
           while(userinput != 0){
               if(userinput == 1){
                   for(Movie movie : movies){
                       System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
                   }
               } else if(userinput == 2){
                   System.out.printf("What category would you like to view?%n1: animated%n2: drama%n3: horror%n4: scifi");
                   int userCategory = input.getInt(1,4);
                   for(Movie movie : movies){
                       if(movie.getCategory().equals(movie.getCategory())){
                           System.out.printf("%s - %s%n",movie.getName(), movie.getCategory());
                       }
                   }
               }
           }
    }
    public int getCategories(){

        Scanner myScanner = new Scanner(System.in);
        int userInput = myScanner.nextInt();
        boolean stopper = false;
        while(!stopper) {
            if (userInput == 1) {
                System.out.printf("What category would you like to view?%n1: animated%n2: drama%n3: horror%n4: scifi");
                switch (userInput){
                    case 1:
                        //"%s-%s%n",Movie.getName(), Movie.getCategory("animated")
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                }
                stopper = true;
            } else if (userInput == 2) {
                System.out.println("Enjoy :)");
                stopper = true;
            } else {
                System.out.println("Please enter a valid selection");
                userInput = myScanner.nextInt();
            }
        }
        return userInput;
    };
}
