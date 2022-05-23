package vistulanikhil50291;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {


        int[] Array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int stcounter = 0;


        System.out.println("Before: " + Arrays.toString(Array));

        // Task : 1-a

        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] > Array[i + 1]) {
                int OK = Array[i];
                Array[i] = Array[i + 1];
                Array[i + 1] = OK;



            }
        }




        //   Task 1-b


        System.out.println(Arrays.toString(Array));
        for (int i = 1; i < Array.length - 1; i++)
        {
            {
                stcounter++;
                for (int x = 0; x < Array.length - 1; x++)
                {
                    stcounter++;
                    if (Array[x] > Array[x + 1])
                    {
                        stcounter++;
                        int OK = Array[x];
                        Array[x] = Array[x + 1];
                        Array[x + 1] = OK;

                    }
                }
            }
        }

        // Task 1-c

        for (int i = 1; i < Array.length - 1; i++) {
            {
                stcounter++;
                for (int x = 0; x < Array.length - 1; x++) {
                    stcounter++;
                    if (Array[x] > Array[x + 1]) {
                        stcounter++;
                        int OK = Array[x];
                        Array[x] = Array[x + 1];
                        Array[x + 1] = OK;

                    }
                }
            }


            // Task 1-d

            boolean Makes = true;

            for (int a = 1; a < Array.length && Makes; a++) {
                Makes = false;
                stcounter++;
                for (int b = 0; b < Array.length - a; b++) {
                    stcounter++;

                    if (Array[b] > Array[b + 1]) {
                        stcounter++;

                        int hello = Array[a];
                        Array[b] = Array[b + 1];
                        Array[b + 1] = hello;
                        Makes = true;

                    }

                }


            }


            System.out.println("After: " + Arrays.toString(Array));
            System.out.println(Arrays.toString(Array));
            System.out.println(stcounter);


        }

    }
}
