package POJO;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            Student s = new Student("S92300" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Rob";
                case 4 -> "Frank";
                case 5 -> "Sally";
                        default -> "Anonymous";
                    },
                    "05/11/1995" ,
                    "Java Masterclass");
            System.out.println(s);
        }
    }
}
