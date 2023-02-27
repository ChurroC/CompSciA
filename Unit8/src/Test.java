public class Test {
    public static void main(String[] args) {
        int[][] arr = {{3, 2, 1}, {4, 3, 5}};



        for (int row = 0; row < arr.length; row++)

        {

            for (int col = 0; col < arr[row].length; col++)

            {

                if (col > 0)

                {
                    if (arr[row][col] >= arr[row][col - 1])

                    {

                        System.out.println("Condition one");

                    }

                }

                if (arr[row][col] % 2 == 0)

                {

                    System.out.println("Condition two");

                }

            }

        }
    }
}
