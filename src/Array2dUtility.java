
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print (int[][] twoDArray) {
        for(int[] array : twoDArray) {
            for(int x : array) {
                System.out.println(x+" ");
            }
        }
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum (int[][] twoDArray) {
        int cnt = 0;
        for(int[] array : twoDArray) {
            for(int x : array) {
                cnt+= x;
            }
        }
        return cnt;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average (int[][] twoDArray) {
        int sum = 0;
        int cnt = 0;
        for (int[] array : twoDArray) {
            for(int x : array) {
                sum += x;
                cnt++;
            }
        }
        return (double) sum/cnt;
    }
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum (int[][] twoDArray) {
        int min = twoDArray[0][0];
        for(int[] array : twoDArray) {
            for(int x : array) {
                if (x<min) {
                    min = x;
                }
            }
        }
        return min;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum (int[][] twoDArray) {
        int max = twoDArray[0][0];
        for(int[] array : twoDArray) {
            for(int x : array) {
                if (x>max) {
                    max = x;
                }
            }
        }
        return max;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method
    public static int evenCountStandard (int[][] twoDArray) {
        int cnt =0;
        for(int i=0;i<twoDArray.length;i++) {
            for(int j=0;j<twoDArray[i].length;j++) {
                if(twoDArray[i][j]%2==0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced (int[][] twoDArray) {
        int cnt =0;
        for (int[] array : twoDArray) {
            for(int x : array) {
                if(x%2==0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive (int[][] twoDArray) {
        for(int[] array : twoDArray) {
            for (int x : array) {
                if(x <0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums (int[][] twoDArray) {
        int[] row = new int[twoDArray.length];
        int sum = 0;
        for (int i=0;i<twoDArray.length;i++) {
            for (int j=0;j<twoDArray[i].length;j++) {
                row[i] += twoDArray [i][j];
            }
        }
        return row;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums (int[][] twoDArray) {
        int cnt = 0;
        for (int[] array : twoDArray) {
            if(array.length > cnt) {
                cnt = array.length;
            }
        }
        int[] col = new int[cnt];
        for(int i=0;i<twoDArray.length;i++) {
            for(int j=0;j<twoDArray[i].length;j++){
                col[j] += twoDArray[i][j];
            }
        }
        return col;
    }
}
