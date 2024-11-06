import java.util.Scanner;

public class ItemOfJewellery {
    public String description;
    public String type;
    public String targetGender;
    public int retailPrice;
    public String image;
    public GenericLinkedList<MaterialOrComponents> matCompList;

    public ItemOfJewellery(String description, String type, String targetGender, int retailPrice, String image) {
        this.description = description;
        this.type = type;
        this.targetGender = targetGender;
        this.retailPrice = retailPrice;
        this.image = image;
        matCompList = new GenericLinkedList<>();
    }

    public void addMaterial() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter type: ");
        String type = input.nextLine();

        System.out.print("Enter description: ");
        String description = input.nextLine();

        System.out.print("Enter weight: ");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.print("Enter quality: ");
        String quality = input.nextLine();

        MaterialOrComponents matCom = new MaterialOrComponents(type, description, weight, quality);
        matCompList.addLast(matCom);
    }

    public void display() {
        // Display basic item details
        System.out.println("Jewellery Item Details:");
        System.out.println("Description: " + description);
        System.out.println("Type: " + type);
        System.out.println("Target Gender: " + targetGender);
        System.out.println("Retail Price: " + retailPrice);
        System.out.println("Image URL: " + image);

        // Display the materials or components of the jewellery item
        System.out.println("\nMaterials/Components:");
        if (matCompList.size == 0) {
            System.out.println("No materials added yet.");
        } else {
            for (MaterialOrComponents mat : matCompList) {
                System.out.println("Type: " + mat.type);
                System.out.println("Description: " + mat.description);
                System.out.println("Weight: " + mat.weight);
                System.out.println("Quality: " + mat.quality);
                System.out.println("---------------------------");
            }
        }
    }

}
