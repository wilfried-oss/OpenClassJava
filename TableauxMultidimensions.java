import java.util.Scanner;

class TableauxMultidimensions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print("Element [" + (i+1) + "][" + (j+1) + "] : ");
                matrix[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        System.out.println("Affichage de la Matrice ");
        parcourirTableau(matrix);
    }

    static void parcourirTableau(int[][] array)
    {
        for (int[] tab : array)
        {
            for (int i : tab)
                System.out.print("\t" + i + " ");
            System.out.println();
        }
    }
}
