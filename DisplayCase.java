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

        DisplayTray tray = new DisplayTray(identifier, inlayMaterialColor, dimension);
        displayTrays.addLast(tray);
    }
}
