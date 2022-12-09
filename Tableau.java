import java.util.Scanner;

class Tableau
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arrayNumber = {1, 2, 3, 5, 144};
        String[] tab = {"toto", "tata", "titi", "tete"};
        int i = 0, position = 0;

        System.out.println("Nombre à rechercher : ");

        /*
        int checkNumber = sc.nextInt();
        sc.nextLine();
        while (i < arrayNumber.length  && checkNumber != arrayNumber[i])
        {
            position = i;
            i++;
        }
        if(i < arrayNumber.length)
            System.out.println( checkNumber + " is found in array " + " at position " + position);
        else
            System.out.println("Pas trouvé ! Sorry :) ");
        */

        display(arrayNumber);
    }

    static void display(int[] tab)
    {
        for(int i :tab) System.out.println(i);
    }

    static String display()
    {
        return "Hello World";
    }



}