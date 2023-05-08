package MyPkg;

public class RacePredictor extends TimeDistanceCalculator{

    public RacePredictor(TimeAndDistance timeAndDistance) {
        super(timeAndDistance);
    }

    public String calculate() {
        int seconds = timeAndDistance.getTotalSeconds();
        int distance = timeAndDistance.getDistance();

        double predictedSecondsPerMile = seconds * (Math.pow((1609 / distance), 1.06));
        double predictedSecondsPerTwoMile = seconds * (Math.pow((3218 / distance), 1.06));
        double predictedSecondsPerFiveK = seconds * (Math.pow((5000 / distance), 1.06));
        double predictedSecondsPerTenK = seconds * (Math.pow((10000 / distance), 1.06));

        MinutesAndSeconds mileDetails = convertToMinutesAndSeconds(predictedSecondsPerMile);
        MinutesAndSeconds twoMileDetails = convertToMinutesAndSeconds(predictedSecondsPerTwoMile);
        MinutesAndSeconds fiveKDetails = convertToMinutesAndSeconds(predictedSecondsPerFiveK);
        MinutesAndSeconds tenKDetails = convertToMinutesAndSeconds(predictedSecondsPerTenK);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("\nThe converted mile time is: %d:%d\n", mileDetails.minutes, mileDetails.seconds));
        stringBuilder.append(String.format("The converted 2 mile time is: %d:%d\n", twoMileDetails.minutes, twoMileDetails.seconds));
        stringBuilder.append(String.format("The converted 5K time is: %d:%d\n", fiveKDetails.minutes, fiveKDetails.seconds));
        stringBuilder.append(String.format("The converted 10K time is: %d:%d\n", tenKDetails.minutes, tenKDetails.seconds));
        return stringBuilder.toString();
    }

    public MinutesAndSeconds convertToMinutesAndSeconds(double seconds){

        int minutes = (int) (seconds / 60);
        int newSeconds = (int) (seconds % 60);
        return new MinutesAndSeconds(minutes, newSeconds);
    }

    private class MinutesAndSeconds {

        private int minutes;
        private int seconds;


        public MinutesAndSeconds(int minutes, int seconds) {
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }
}
