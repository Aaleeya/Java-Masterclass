package Polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Adventure", "Star wars");
//        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter a type (A for Adventure, C for Comedy, S for Science fiction," +
                    "or Q for Quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
        s.close();
    }
}
