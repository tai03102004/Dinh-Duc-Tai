// Balanced Brackets
/*
class Result {
    public static boolean check(char start,char end){
        if (start == '(' && end == ')' ) return true;
        else if (start == '[' && end == ']' ) return true;
        else if (start == '{' && end == '}' ) return true;
        return false;
    }

    public static String isBalanced(String s) {
        // Write your code here
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i=0;i<n;i++){
            char cur = s.charAt(i);
            if ( cur =='(' || cur == '[' || cur == '{'  ){
                st.push(cur);
            }
            else{
                if (st.isEmpty() || !check(st.peek(),cur)  ){
                    return "NO";
                }
                else st.pop();
            }
        }
        if (st.empty()){
            return "YES";
        }
        else return "NO";
    }

}
*/
//Queue using Two Stacks
/*
import java.io.*;
import java.util.*;

public class Solution {
    public static void in(Queue<Integer> q){
        int heek = q.peek();
        System.out.println(heek);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                Queue<Integer> q = new LinkedList<>();
        while (n-- > 0){
        int x = sc.nextInt();
        if (x==1){
        int y = sc.nextInt();
        q.add(y);
        }
        else if (x==2){
        q.remove();
        }
        else {
        in(q);
        }
        }
        }
        }

 */
//Simple Text Editor
/*
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String text = "";
        Stack<String> st = new Stack<>();
        while (q-- > 0){
            int x = sc.nextInt();
            if (x==1){
                String y = sc.next();
                st.push(text);
                text += y;
            }
            else if (x==2){
                st.push(text);
                int y = sc.nextInt();
                int n = text.length();
                text = text.substring(0,n-y);
            }
            else if (x==3){
                int y = sc.nextInt();
                System.out.println(text.charAt(y-1));
            }
            else {
                if (!st.isEmpty()){
                    String y = st.pop();
                    text = y;
                }
            }
        }
    }
}

 */
// Selection sort
/*
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Selection {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 8};
        System.out.println("Input array: " + Arrays.toString(arr));

        long start = System.currentTimeMillis();
        selectionSort(arr);
        long end = System.currentTimeMillis();

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Time taken: " + (end - start) + " milliseconds.");

        try {
            FileWriter writer = new FileWriter("runtime.txt");
            writer.write("Time taken: " + (end - start) + " milliseconds.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
// Equal Stacks
/*
 public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    // Write your code here
        int sum1 = 0 ,sum2 = 0 ,sum3 = 0;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        for (int i= h1.size()-1;i>=0;i--){
            sum1 += h1.get(i);
            s1.push(h1.get(i));
        }
        for (int i= h2.size()-1;i>=0;i--){
            sum2 += h2.get(i);
            s2.push(h2.get(i));
        }
        for (int i= h3.size()-1;i>=0;i--){
            sum3 += h3.get(i);
            s3.push(h3.get(i));
        }
        int i = 0 , j = 0, k =0;
        while ( !s1.empty() || !s2.empty() || !s3.empty()){
            if(sum1 > sum2 || sum1 > sum3){
                int x = s1.pop();
                sum1 -= x;
            }
            else if(sum2 > sum1 || sum2 > sum3){
                int x = s2.pop();
                sum2 -= x;
            }
            else if(sum3 > sum2 || sum3 > sum1){
                int x = s3.pop();
                sum3 -= x;
            }
            else return sum1;
        }
    }

}
 */