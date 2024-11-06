import java.util.Scanner;

public class JewelleryStore {
    public GenericLinkedList<DisplayCase> displayCases;

    public JewelleryStore() {
        displayCases = new GenericLinkedList<>();
    }

    public void addDisplayCase() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter identifier (as an integer): ");
        int identifier = input.nextInt();
        input.nextLine();

        System.out.print("Enter type: ");
        String type = input.nextLine();

        System.out.print("Does it have lighting? (yes/no): ");
        char lightingChar = input.nextLine().toLowerCase().charAt(0);
        boolean lighting = (lightingChar == 'y');

        DisplayCase displayCase = new DisplayCase(identifier, type, lighting);
        displayCases.addLast(displayCase);
    }

    public void viewALLStock(){
//        StringBuilder allDetails = new StringBuilder();
//
//        int i = 1, j = 1, k = 1;
//
//        for (DisplayCase displayCase : displayCases){
//            allDetails.append("Display Case " + i +"\n");
//            i++;
//            for (DisplayTray displayTray : displayCase.displayTrays){
//
//            }
//        }
    }

    public void drillDown() {

    }

    public ItemOfJewellery searchForItem(String text) {
        return null;
    }

    public void smartAdd(ItemOfJewellery itemToAdd) {

    }

    public void removeItem() {

    }

    public void value() {

    }

    public void reset() {

    }
    public void save(){

    }
    public void load(){

    }

    public void display() {
        // Display the jewellery store's display cases
        System.out.println("Jewellery Store Display Cases:");

        if (displayCases.size == 0) {
            System.out.println("No display cases in the store.");
        } else {
            for (DisplayCase displayCase : displayCases) {
                displayCase.display();
                System.out.println("============================");
            }
        }
    }


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            JewelleryStore store = new JewelleryStore();

            // 添加展示柜
            store.addDisplayCase();

            // 查看添加的展示柜
            store.display();

            // 添加展示托盘
            if (store.displayCases.size > 0) {
                DisplayCase displayCase = store.displayCases.getHeadData();
                displayCase.addDisplayTray();
            }

            // 查看展示柜中的托盘
            store.display();

            // 添加珠宝项链
            if (store.displayCases.size > 0 && store.displayCases.getHeadData().displayTrays.size > 0) {
                DisplayCase displayCase = store.displayCases.getHeadData();
                DisplayTray displayTray = displayCase.displayTrays.getHeadData();
                displayTray.addItemOfJewellery();
            }

            // 查看珠宝项链
            store.display();

            // 添加材料到珠宝项链
            if (store.displayCases.size > 0 && store.displayCases.getHeadData().displayTrays.size > 0) {
                DisplayCase displayCase = store.displayCases.getHeadData();
                DisplayTray displayTray = displayCase.displayTrays.getHeadData();
                ItemOfJewellery jewellery = displayTray.jewelleries.getHeadData();
                jewellery.addMaterial();
            }

            // 查看珠宝项链的材料
            store.display();
        }
    }


