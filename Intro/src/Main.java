public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int n1 = 2;
        int n2 = 3;

        int sum = n1 + n2;
        System.out.println("The sum of " + n1 + " + "+n2+ " = "+sum);
        System.out.println("I am "+ n1 +" years in programming");

        //CONVERSION IMPLICIT, EXPLICIT
        double n3 = 5.8;
        float n4 = 3.5f;

        double dumn1 = n1;
        System.out.println(dumn1);

        //OPERATORS
        System.out.println("ADDITION: " + (n1 + n2));
        System.out.println("sUBTRACTION: " + (n1 - n2));
        System.out.println("mULTIPLICATION: "+(n1 * n2));
        System.out.println("dIVISION: "+(n3 / n2));
        System.out.println("MODULO: "+(n1 % n2));

        //RELATIONAL OPERATORS
        System.out.println("\n\nis equal to : "+ (n1 == n2));
        System.out.println("is not equal to : "+ (n1 != n2));
        System.out.println("is greater than : "+ (n1 > n2));
        System.out.println("is greater than or equal to: "+ (n1 >= n2));
        System.out.println("is less than : "+ (n1 < n2));
        System.out.println("is less than or equal to:"+ (n1 <= n2));

        //STRINGS: WHY NOT CAUSE THEY HAVE WAHALA
        String name1 = "abc";
        String name2 = "abc";

        String objNm1 = new String("xyz");
        String objNm2 = new String("xyz");
        System.out.println("\n\n    STRINGS");
        System.out.println(name1 == name2);
        System.out.println(objNm1 == objNm2);

        String country = "Nigeria";
        int age = 24;
        double weight = 75.1;
        double height = 5.8;
        char atsign = '@';
        String job = "Asda";

        String frmtString = String.format("My name is %s, I am from %s, I am %d yrs old, my height and weight %f %f respectively and I work %c %s",
                name1,country,age,height,weight,atsign,job);

        System.out.println(frmtString);


        String word = "The sky is blue";

        System.out.println("\n\n"+word.replace("blue","red"));

        String updateS = word.replace("blue","green");
        System.out.println(updateS);

        System.out.println(word);
        System.out.println(word == updateS);




    }

}