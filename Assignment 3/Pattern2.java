/*
A 
A B 
A B C 
A B C D 
A B C D E
*/

class Pattern2
{
    public static void main(String[] args)
    {

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char)(64 + j) + " "); // 65 ASCII = A

            }
            System.out.println();
        }
    }
}