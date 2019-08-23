import java.util.*;
import java.io.*;
public class BottledUpFeelings{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int totalVolume =  keyboard.nextInt(), bigBottleVolume = keyboard.nextInt(), smallBottleVolume = keyboard.nextInt() , numBig = 0, numSmall = 0;
        int outputBig = totalVolume, outputSmall = totalVolume;
        for(numBig= (totalVolume / bigBottleVolume); numBig >= 0 ;numBig--){
            numSmall = (totalVolume - (numBig*bigBottleVolume)) / smallBottleVolume;
            if(((bigBottleVolume * numBig) + (smallBottleVolume * numSmall)) == totalVolume){
                if((numBig + numSmall) < (outputBig + outputSmall)){
                    outputBig = numBig;
                    outputSmall = numSmall;
                    break;
                }
            }
        }
        if((outputBig == totalVolume) && (outputSmall == totalVolume)) System.out.println("Impossible");
        else System.out.println(outputBig + " " + outputSmall);
    }
}