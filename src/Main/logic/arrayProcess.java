package  Main.logic;
public class arrayProcess implements ArrayProcessor{
    @Override
    public double calculate(double[] oneDArr) {
        double sum = 0;
        for (int i = 0; i < oneDArr.length; i++) {
            if ((int) oneDArr[i] % 3 == 0) {
                sum += oneDArr[i];
            }
        }
        return sum;
    }
    @Override
    public void processArray(double[] oneDArr,double sum) {
        System.out.println("Array:");
        for (int i = 0; i < oneDArr.length; i++) {
            System.out.print(oneDArr[i] + " ");
        }
        System.out.println("\nSum of multiples of 3 = " + sum);
    }
    @Override
    public double calculate(double[][] twoDArr) {
        double maxNum=twoDArr[0][0];
        for (int i = 0; i<twoDArr.length;i++)
            for(int j = 0; j < twoDArr.length; j++){
            if( maxNum < twoDArr[i][j]) {
                maxNum = twoDArr[i][j];
            }
        }
        System.out.println("Max: " + maxNum);

        int count = 0;
        double sum = 0.0;
        for (int i = twoDArr.length / 2; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr.length - i; j++) {
                if (Math.abs(twoDArr[i][j] - maxNum) <= 0.1 * maxNum) {
                    count++;
                    sum += twoDArr[i][j];
                }
            }
        }
        for (int i = twoDArr.length / 2; i < twoDArr.length; i++) {
            for (int j = i; j < twoDArr.length ; j++) {
                if (Math.abs(twoDArr[i][j] - maxNum) <= 0.1 * maxNum) {
                    count++;
                    sum += twoDArr[i][j];
                }
            }
        }
            return count > 0 ? sum / count : 0.0;

    }
    @Override
    public void processArray(double[][] twoDArr,double count) {
       /* System.out.println("Double matrix:");
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                System.out.print(twoDArr[i][j]+" ");
            }
            System.out.println();
        }*/
        System.out.println("Average for shaded area = "+ count);
    }
}