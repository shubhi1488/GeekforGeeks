/*
You are given an integer N. Print numbers from 1 to N without the help of loops.

Example 1:

Input:
N = 5
Output:
1 2 3 4 5
Explanation:
We have to print numbers from 1 to 5
*/
class Solution{
    static void printTillN(int N){
        // code here
        if(N==0){
            return;
        }//base condition if the N reaches to 0 than the recursion will stop 
        printTillN(N-1);//It will call the recursive function and decrease the number by 1
        System.out.print(N+" ");//now print N 
    }
}
