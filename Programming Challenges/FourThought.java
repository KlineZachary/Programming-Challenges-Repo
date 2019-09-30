///NOT DONE


// import java.util.*;
// public class FourThought{
//     public static void main(String[] args) {
//         Scanner keyboard = new Scanner(System.in);
//         int cases = keyboard.nextInt();
//         char[] operations = {'+','-','*','/'};
//         char[] outputOps = new char[3];
//         for(int i = 0; i < cases;i++){
//             int sum = keyboard.nextInt();
//             StringBuilder output = new StringBuilder();
//             for(int j = 0; j < operations.length; j++){
//                 int firstSum = 0;
//                 if(operations[j] == '+'){ 
//                     outputOps[0] = '+';
//                     firstSum += 4;
//                 }else if(operations[j] == '-'){
//                     outputOps[0] = '-';
//                     firstSum -= 4;

//                 }else if(operations[j] == '*'){
//                     outputOps[0] = '*';
//                     firstSum *= 4;

//                 }else if(operations[j] == '/'){
//                     outputOps[0] = '/';
//                     firstSum /= 4;

//                 } 
//                 for(int k = 0; k < operations.length; k++){
//                     int secondSum = firstSum;
//                     if(operations[k] == '+'){ 
//                         outputOps[1] = '+';
//                         secondSum += 4;
//                     }else if(operations[k] == '-'){
//                         outputOps[1] = '-';
//                         secondSum -= 4;

//                     }else if(operations[k] == '*'){
//                         outputOps[1] = '*';
//                         secondSum *= 4;

//                     }else if(operations[k] == '/'){
//                         outputOps[1] = '/';
//                         secondSum /= 4;
//                     } 
//                     for(int l = 0; l < operations.length; l++){
//                         int thirdSum = secondSum;
//                         if(operations[l] == '+'){ 
//                             outputOps[2] = '+';
//                             thirdSum += 4;
//                         }else if(operations[l] == '-' ){
//                             outputOps[2] = '-';
//                             thirdSum -= 4;
//                         }else if(operations[l] == '*' ){
//                             outputOps[2] = '*';
//                             thirdSum *= 4;
//                         }else if(operations[l] == '/'){
//                             outputOps[2] = '/';
//                             thirdSum /= 4;
//                         } 
//                         if(thirdSum == sum){
//                             System.out.println( "" + 4 + " " + outputOps[0] + " " + 4 + " " +  outputOps[1] + " " + 4 + " " + outputOps[2] + " " + 4 + " = " + thirdSum);
//                             // return;
//                         }
//                     }
//                 }
//             }
//             // if (outputOps[0] == 0) System.out.println("no solution");
//         } 
//     }
// }