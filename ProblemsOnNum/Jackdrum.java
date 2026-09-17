//Problem Statement – Jack is a sports teacher at St. Patrick's School.
// There are N students standing in a line. Each student wears a unique jersey numbered from 1 to N.
// At every position, there is a fixed board displaying a number.
// These board numbers form a permutation of integers from 1 to N. 
// Initially, students stand in increasing order of jersey numbers.
//Example 2 Input N = 5 Board = [2,3,1,5,4] 
// Initial Arrangement Board : 2 3 1 5 4 Students : 1 2 3 4 5 
// After Beat 1 Students : 3 1 2 5 4 
// After Beat 2 Students : 2 3 1 4 5 
// After Beat 3 Students : 1 2 3 5 4 
// After Beat 4 Students : 3 1 2 4 5 
// After Beat 5 Students : 2 3 1 5 4 
// After Beat 6 Students : 1 2 3 4 5 
// Students return to the original arrangement after 6 beats. 
// Output 6
import java.util.*;
public class Jackdrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] board = new int[n];
        for (int i = 0; i < n; i++) {
            board[i] = sc.nextInt();
        }
        int[] initial = new int[n];
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            initial[i] = i + 1;
            students[i] = i + 1;
        }
        int beats = 0;
        do {
            int[] next = new int[n];
            for (int i = 0; i < n; i++) {
                next[board[i] - 1] = students[i];
            }
            students = next;
            beats++;
        } while (!Arrays.equals(students, initial));
        System.out.println(beats);
    }
}