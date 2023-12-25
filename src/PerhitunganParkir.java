public class PerhitunganParkir {
    public static double calculateParkingFee(int hours) {
        // Biaya untuk 5 jam pertama
        double baseFee = 5.0;

        // Biaya per jam setelah 5 jam pertama
        double hourlyRate = 0.5;

        // Biaya flat parkir melebihi 24 jam
        double maxFee = 15.0;

        // Hitung biaya parkir
        if (hours <= 5) {
            return baseFee;
        } else if (hours <= 24) {
            return baseFee + (hours - 5) * hourlyRate;
        } else {
            return maxFee;
        }
    }

    public static void main(String[] args) {
        int parkedHours = 26;
        double parkingFee = calculateParkingFee(parkedHours);
        System.out.println("Biaya parkir untuk " + parkedHours + " jam adalah $" + parkingFee);
    }
}