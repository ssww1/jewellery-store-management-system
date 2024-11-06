import java.util.Scanner;

public class DisplayTray {
    public String identifier;
    public String inlayMaterialColor;
    public int dimension;
    public GenericLinkedList<ItemOfJewellery> jewelleries;

    public DisplayTray(String identifier, String inlayMaterialColor, int dimension) {
        this.identifier = identifier;
        this.inlayMaterialColor = inlayMaterialColor;
        this.dimension = dimension;
        jewelleries = new GenericLinkedList<>();
    }

    public void addItemOfJewellery() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter description: ");
        String description = input.nextLine();

        System.out.print("Enter type: ");
        String type = input.nextLine();

        System.out.print("Enter target gender: ");
        String targetGender = input.nextLine();

        System.out.print("Enter retail price: ");
        int retailPrice = input.nextInt();
        input.nextLine();

        System.out.print("Enter image URL: ");
        String image = input.nextLine();


        ItemOfJewellery jewellery = new ItemOfJewellery(description, type, targetGender, retailPrice, image);
        jewelleries.addLast(jewellery);
    }
}
