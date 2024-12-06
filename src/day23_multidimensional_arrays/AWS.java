package day23_multidimensional_arrays;

public class AWS {
    public static void main(String[] args) {
        String appName = "etsy";
        String  zones = "us-east, us-west-2, us-west-3";
        String [] zoneArr = zones.split(", ");
        for (int i = 0; i < zoneArr.length; i++) {
            System.out.println("Deploying " + appName + " to " + zoneArr[i]);
            System.out.println("Deploying completed for " + zoneArr[i] + "\n");

        }
    }
}
