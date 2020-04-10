/*
2020_Round_A_Allocation
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();

        for (int t = 1; t <= tc; t++) {
            int houseNum = scanner.nextInt();
            int budget = scanner.nextInt();
            int[] houses = new int[houseNum];
            for (int i = 0; i < houseNum; i++) {
                houses[i] = scanner.nextInt();
            }

            Arrays.sort(houses);
            int count = 0;
            for (int j = 0; j < houseNum; j++) {
                if (houses[j] <= budget) {
                    count++;
                    budget -= houses[j];
                }
            }

            System.out.println("Case #" + t + ": " + count);
        }
    }
}
