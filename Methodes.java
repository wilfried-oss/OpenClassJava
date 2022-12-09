class Methodes
{
    public static void main(String[] args)
    {
        /*
        *   Surchage de fonction en java
        *
        * */
        int[] nombresPairs = {2, 4, 6, 8};
        int[] nombresImpairs = {11, 13, 3, 5, 7, 9, 15};
        double[] ordersPrice = {0.1, 10.2, 15, 12.5};
        String[] users = {"User1", "User2", "User3"};

        displayArray(nombresImpairs);
        displayArray(nombresPairs);
        displayArray(ordersPrice);
        displayArray(users);
        System.out.println(mostExpansive(ordersPrice));
        System.out.println("ARRAY SHORT : ");
        range(nombresImpairs);
    }

    static double mostExpansive(double[] tab)
    {
        double max = 0.0;
        for (double v : tab) {
            if (v > max) max = v;
        }
        return max;
    }

    static void displayArray(int[] tab)
    {
        for(int i : tab) System.out.print(i + "  ");
        System.out.println();
    }

    static void displayArray(double[] tab)
    {
        for(double i : tab) System.out.println(i);
        System.out.println();
    }

    static void displayArray(String[] tab)
    {
        for(String str : tab) System.out.println(str);
        System.out.println();
    }

    static void range(int[] tab)
    {
        int tmp = 0;
        for(int i = 0; i < tab.length; i++)
        {
            for (int j = 0; j < tab.length -1 ; j++)
            {
                if(tab[j] > tab[j+1])
                {
                    tmp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = tmp;
                }
            }
        }
        displayArray(tab);
    }
}
