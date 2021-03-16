public class BonusMilesService {
    public static int calculate(int cost){
        int milesCoefficient = 20;
        int bonusMiles = cost / milesCoefficient;
        return bonusMiles;
    }
}