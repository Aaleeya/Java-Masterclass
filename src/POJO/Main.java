package POJO;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
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

        Student pojoStudent = new Student("S923006" , "Ann", "05/11/1991", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Jake", "23/01/1998", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking "+ pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking "+ recordStudent.classList());
    }
}
