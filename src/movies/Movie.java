package movies;

public class Movie {
    private String name;
    private String category;

    //constructor
    public Movie(String name,String category) {
        this.name = name;
        this.category = category;
    }

    //getter
    public String getName(){
        return this.name;
    }

    //getter
    public String getCategory(){
        return this.category;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    //setter
    public void setCategory(String category){
        this.category = category;
    }

    //testing
    public static void main(String[] args) {
        Movie movie = new Movie("My Life", "Biography");
        System.out.println("The name of your movie is: " + movie.getName());
        System.out.println("The category of your movie is: " + movie.getCategory());
    }
}
