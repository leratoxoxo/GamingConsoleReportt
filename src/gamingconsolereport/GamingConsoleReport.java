package gamingconsolereport;

public class GamingConsoleReport {

    public static void main(String[] args) {

        // Cities
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Sales: PS5, XBOX, SWITCH
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println();

        System.out.println("\t\tPS5\tXBOX\tSWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t"
                    + sales[i][0] + "\t"
                    + sales[i][1] + "\t"
                    + sales[i][2]);
        }

        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");

        int highestSales = 0;
        String cityWithMostSales = "";

        for (int i = 0; i < cities.length; i++) {

            int total = sales[i][0]
                    + sales[i][1]
                    + sales[i][2];

            System.out.println(cities[i] + "\t" + total);

            if (total > highestSales) {
                highestSales = total;
                cityWithMostSales = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: "
                + cityWithMostSales);
    }
}
