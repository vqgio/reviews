import java.io.*;

public class DealershipFileManager {
    private static final String FILE_PATH = "inventory.csv";

    public static Dealership getDealership() {
        Dealership dealership = new Dealership("Default", "Unknown Location", "Unknown Phone");
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            System.err.println("ERROR: Inventory file not found. Ensure the file exists before loading.");
            return dealership;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length != 8) {
                    System.err.println("Invalid data format: " + line);
                    continue; // Skip invalid lines
                }

                try {
                    int vin = Integer.parseInt(data[0]);
                    int year = Integer.parseInt(data[1]);
                    String make = data[2];
                    String model = data[3];
                    String vehicleType = data[4];
                    String color = data[5];
                    int odometer = Integer.parseInt(data[6]);
                    double price = Double.parseDouble(data[7]);

                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(vehicle);
                } catch (NumberFormatException e) {
                    System.err.println("ERROR: Invalid number format in data: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("ERROR: Failed to read inventory file. " + e.getMessage());
        }

        return dealership;
    }

    public static void saveDealership(Dealership dealership) {

    }

}
