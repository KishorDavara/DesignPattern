package builder;

public class Main  {
    public static void main(String[] args) {
        House luxuryHouse = new House.Builder()
                .walls(4)
                .roof(true)
                .garage(true)
                .garden(true)
                .swimmingPool(true)
                .build();

        House simpleHouse = new House.Builder()
                .walls(4)
                .roof(true)
                .build();

        System.out.println(luxuryHouse);
        System.out.println(simpleHouse);
    }
}
