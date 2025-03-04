import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //TASK 2 MARS
        System.out.println("TASK 2");
        String myName = "Ersultan";
        float myWeightIsmailov = 75f;
        float marsWeightIsmailov;

        System.out.println("My weight is " + myWeightIsmailov);

        marsWeightIsmailov = myWeightIsmailov * 0.38f;
        System.out.println("My mars weight is " + marsWeightIsmailov);

        double doubleMarsWeightIsmailov = (double) marsWeightIsmailov;

        System.out.println("double weight is " + doubleMarsWeightIsmailov);

        System.out.printf("4 decimal places: %.4f%n", doubleMarsWeightIsmailov);

        int intWeightIsmailov = (int) doubleMarsWeightIsmailov;

        System.out.println("int weight is " + intWeightIsmailov);

        char charWeightIsmailov = (char) intWeightIsmailov;

        System.out.println("char weight is " + charWeightIsmailov);

        int mathActivityOnChar = charWeightIsmailov * 10;

        System.out.println("Mathematical activity on char: " + mathActivityOnChar);


        System.out.println("==========================================");
        System.out.println("TASK 3");

        //TASK 3
        int randomNum = (int) (Math.random() * 100);

        System.out.println("Random number is " + randomNum);

        if (randomNum % 2 == 0) {
            System.out.println("This random number is even");
        } else {
            System.out.println("This random number is odd");
        }

        System.out.println("==========================================");
        System.out.println("TASK 4");

        int amountOfBricks = 55;
        int containerCapacity = 8;
        System.out.println("Amount of bricks is " + amountOfBricks);
        System.out.println("Container capacity is " + containerCapacity);

        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Amount of full container is " + fullContainers);

        int totalContainers = (amountOfBricks + containerCapacity - 1) / containerCapacity;
        System.out.println("Total number of containers (full + not full): " + totalContainers);

        int remainingBricks = amountOfBricks % containerCapacity;
        System.out.println("Number of bricks in the last not full container: " + remainingBricks);

        System.out.println("==========================================");
        System.out.println("TASK 5");

        double productCost = 9.99;
        double VAT = 1.23;

        System.out.println("Product cost is " + productCost);

        double grossPrice = productCost * VAT;
        System.out.println("Price with VAT is " + grossPrice);

        double total = grossPrice * 10000;

        double totalNet = total / VAT;

        System.out.println("Total with VAT: " + total);
        System.out.println("Total without VAT: " + totalNet);

        System.out.println();

        //WITH BIGDECIMAL
        BigDecimal price = new BigDecimal("9.99");
        System.out.println("Price: " + price);

        BigDecimal vatPrice = price.multiply(new BigDecimal(1.23));

        vatPrice = vatPrice.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Rounded VAT price: " + vatPrice);

        BigDecimal vatValue = vatPrice.multiply(new BigDecimal(10000));
        System.out.println("Value with VAT: " + vatValue);

        BigDecimal newPriceWithoutVat = vatValue.divide(new BigDecimal("1.23"), BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Value without VAT: " + newPriceWithoutVat);

    }
}
