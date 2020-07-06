package chapter5;

public class OpAsign {
    public static void main(String[] args) {
        int numPeople = 11;
        float flight = 575.0f;
        float hotel = 876.35f;
        float carRental = 135.50f;
        float tripPrice = 0f;

        tripPrice += flight;
        tripPrice += hotel;
        tripPrice += carRental;

        System.out.println("Cost per person $" + tripPrice);

        tripPrice *= numPeople;
        System.out.println("Total cost $" + tripPrice);
    }
}
