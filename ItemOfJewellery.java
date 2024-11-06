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


}
