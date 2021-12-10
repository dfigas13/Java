package pl.coderslab.estartupparameters;

public class Main08 {

    public static void main(String[] args) {
        int x = 55;
        int y = 22;

        int x2 = Integer.parseInt(args[0]);
        int z = Integer.parseInt(args[1]);

        greatestCommonDivisor(x,y);
        greatestCommonDivisor(x2,z);


    }
    public static int greatestCommonDivisor(int par1, int par2) {
        int result3 = 0;
        if (par1 > par2) {
            int result = par1 / par2;
            int result2 = par2 * result;
             result3 = par1 - result2;
        }
        return result3;
    }

}
