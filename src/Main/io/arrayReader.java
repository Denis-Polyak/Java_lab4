package Main.io;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
public class arrayReader implements DoubleArrayReader {
    @Override
    public double[] readOneDimensionalArray(File file) {
        try (BufferedReader reader = new BufferedReader(new
                FileReader(file))) {
            reader.readLine();
            String[] split = reader.readLine().trim().split(" +");
            double[] oneDeArr = new double[split.length];
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].replace(',', '.');
                oneDeArr[i] = Double.parseDouble(split[i]);
            }return oneDeArr;
        } catch (IOException e) {
            return new double[0];
        }
    }
    public double[] readOneDimensionalArray(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            int n = in.nextInt();
            double[] oneDArr = new double[n];
            for (int i = 0; i < oneDArr.length; i++) {
                oneDArr[i] = in.nextDouble();
            }
            return oneDArr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }
    @Override
    public double[][] readTwoDimensionalArray(File file2) {
        try (BufferedReader reader = new BufferedReader(new
                FileReader(file2))) {
            int n = Integer.parseInt(reader.readLine());
            double[][] twoDeArr = new double[n][n];
            String line;
            int row = 0;
            while ((line = reader.readLine()) != null) {
                Scanner sc = new Scanner(line);for (int i = 0; i < n && sc.hasNextDouble(); i++) {
                    line = line.replace(',', '.');
                    twoDeArr[row][i] = sc.nextDouble();
                }
                row++;
            }
            return twoDeArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public double[][] readTwoDimensionalArray(String fileName2) {
        try (Scanner in = new Scanner(new File(fileName2))) {
            int n = in.nextInt();
            double[][] twoDArr = new double[n][n];
            for (int i = 0; i < twoDArr.length; i++) {
                for (int j = 0; j < twoDArr.length; j++) {
                    twoDArr[i][j] = in.nextDouble();
                }
            }
            return twoDArr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }
}
