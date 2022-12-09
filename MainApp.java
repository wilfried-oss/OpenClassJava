import java.util.Scanner;

class MainApp
{
    public static void main(String[] args)
    {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Give an number : ");
        int number = sc.nextInt();
        System.out.println("The given number is : " + number);
        sc.nextLine();

        System.out.print("Save a given character : ");
        String str = sc.nextLine();
        System.out.println("Saved character is : " + str.charAt(0));
        */

        char response = 'O';
        String prenom;
        Scanner sc = new Scanner(System.in);

        while (response == 'O')
        {
            //On affiche une instruction
            System.out.println("Donnez un prénom : ");
            prenom = sc.nextLine();
            System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
            response = ' ';
            while (response != 'N' && response != 'O')
            {
                System.out.println("Voulez-vous réessayer ? (O/N)");
                response = sc.nextLine().charAt(0);
            }
        }
        System.out.println("Au revoir…");
    }
}