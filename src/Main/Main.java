package Main;
import Main.io.DoubleArrayReader;
import Main.io.arrayReader;
import Main.logic.ArrayProcessor;
import Main.logic.arrayProcess;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    public void run() {
        File file = new File("lab41.txt");
        DoubleArrayReader arrayReader = new arrayReader();
        double [] oneDeArr= arrayReader.readOneDimensionalArray(file);
        String fileName = "lab41.txt";
        double [] oneDArr= arrayReader.readOneDimensionalArray(fileName);
        ArrayProcessor arrayCount = new arrayProcess();
        double sum = arrayCount.calculate(oneDArr);
        arrayCount.processArray(oneDArr,sum);
        File file2 = new File("lab42.txt");
        double [][] twoDeArr= arrayReader.readTwoDimensionalArray(file2);
        String fileName2="lab42.txt";
        double [][] twoDArr=arrayReader.readTwoDimensionalArray(fileName2);
        double maxNum=arrayCount.calculate(twoDArr);
        arrayCount.processArray(twoDArr,maxNum);
    }
}
