public class Triangle {

    public static int triangleType(int sideA, int sideB, int sideC) {
        if (isAcute(sideA, sideB, sideC)) return 1;
        if (isRight(sideA, sideB, sideC)) return 2;
        if (isObtuse(sideA, sideB, sideC)) return 3;
        return 0;
    }


    private static boolean isAcute(int sideA, int sideB, int sideC) {
        if (allAnglesBelowNinety(calculateAAngle(sideA, sideB, sideC), calculateBAngle(sideA, sideB, sideC), calculateCAngle(sideA, sideB, sideC)))
            return true;
        return false;
    }

    private static boolean allAnglesBelowNinety(double angleA, double angleB, double angleC) {
        return (angleA < 90 && angleB < 90 && angleC < 90);
    }

    private static boolean isRight(int sideA, int sideB, int sideC) {
        if (oneAngleIsNinety(calculateAAngle(sideA, sideB, sideC), calculateBAngle(sideA, sideB, sideC), calculateCAngle(sideA, sideB, sideC)))
            return true;
        return false;
    }

    private static boolean oneAngleIsNinety(double angleA, double angleB, double angleC) {
        return (angleA == 90 || angleB == 90 || angleC == 90);
    }

    private static boolean isObtuse(int sideA, int sideB, int sideC) {
        if (oneAngleAboveNinety(calculateAAngle(sideA, sideB, sideC), calculateBAngle(sideA, sideB, sideC), calculateCAngle(sideA, sideB, sideC)))
            return true;
        return false;
    }

    private static boolean oneAngleAboveNinety(double angleA, double angleB, int angleC) {
        return (between90And180(angleA) || between90And180(angleB) || between90And180(angleC));
    }

    private static boolean between90And180(double angle) {
        if (angle > 90 && angle < 180) return true;
        return false;
    }

    private static double calculateAAngle(int sideA, int sideB, int sideC) {
        return Math.toDegrees(Math.acos(calculateCosTheorem(sideB, sideC, sideA)));
    }

    private static double calculateBAngle(int sideA, int sideB, int sideC) {
        return Math.toDegrees(Math.acos(calculateCosTheorem(sideA, sideC, sideB)));
    }

    private static int calculateCAngle(int sideA, int sideB, int sideC) {
        return (int) Math.toDegrees(Math.acos(calculateCosTheorem(sideA, sideB, sideC)));
    }


    private static double calculateCosTheorem(double sideA, double sideB, double sideC) {
        return getNumerator(sideA, sideB, sideC) / getDenominator(sideA, sideB);
    }

    private static double getDenominator(double sideA, double sideB) {
        return 2 * sideA * sideB;
    }

    private static double getNumerator(double sideA, double sideB, double sideC) {
        return square(sideA) + square(sideB) - square(sideC);
    }

    private static double square(double number) {
        return Math.pow(number, 2);
    }


}
