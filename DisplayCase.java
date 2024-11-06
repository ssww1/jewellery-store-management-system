import java.util.Scanner;

public class DisplayCase {
    public int identifier;
    public String type;
    public boolean lighting;
    public GenericLinkedList<DisplayTray> displayTrays;

    public DisplayCase(int identifier, String type, boolean lighting) {
        this.identifier = identifier;
        this.type = type;
        this.lighting = lighting;
        displayTrays = new GenericLinkedList<>();
    }

    public void addDisplayTray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter identifier: ");
        String identifier = input.nextLine();

        System.out.print("Enter inlay material color: ");
        String inlayMaterialColor = input.nextLine();

        System.out.print("Enter dimension: ");
        int dimension = input.nextInt();
        input.nextLine();

        DisplayTray displayTray = new DisplayTray(identifier, inlayMaterialColor, dimension);
        displayTrays.addLast(displayTray);
    }

    public void display() {
        // Display case details
        System.out.println("Display Case Details:");
        System.out.println("Identifier: " + identifier);
        System.out.println("Type: " + type);
        System.out.println("Lighting: " + (lighting ? "Yes" : "No"));
        System.out.println("\nDisplay Trays in this Case:");

        // Check if there are display trays and display their details
        if (displayTrays.size == 0) {
            System.out.println("No display trays in this case.");
        } else {
            for (DisplayTray tray : displayTrays) {
                tray.display();
                System.out.println("============================");
            }
        }
    }
}
