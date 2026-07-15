package classComponents.constructors;

public class Movie {
    int id ;
    String name;
    String director;
    int year;
    public Movie(){
        id = 101;
        name = "Avangers";
        director = "Kartik";
        year = 2026;
        System.out.println(id);
        System.out.println(name);
        System.out.println(director);
        System.out.println(year);
        System.out.println("Zero param Constructor");
    }

    public Movie(int id, String name, String director, int year){
        this.id = id;
        this.name = name;
        this.director = director;
        this.year = year;
        System.out.println(id);
        System.out.println(name);
        System.out.println(director);
        System.out.println(year);

    }


    static void main(String[] args) {
        Movie movie = new Movie();
        Movie movie1 = new Movie(101, "HAA" , "Kartik", 2002);

    }
}
