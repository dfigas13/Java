package pl.coderslab.methods;

public class Main10 {

    public static void main(String[] args) {
        int ThunderHome = 0;
        int ThunderGuest = 3;
        int LightningHome = 1;
        int LightningGuest = 2;

        System.out.println(footballWin(ThunderHome, ThunderGuest, LightningHome, LightningGuest));
    }


    public static String footballWin(int ThunderHome, int ThunderGuest, int LightningHome, int LightningGuest) {
        int allPointsA = ThunderHome + ThunderGuest;
        int allPointsB = LightningHome + LightningGuest;
        if (allPointsB == allPointsA) {
            if (ThunderGuest > LightningGuest) {
                return "Thunder gewonnen";
            }
        }
        return "Lightning gewonnen";
    }

}
