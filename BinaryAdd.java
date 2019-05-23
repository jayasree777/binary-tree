import java.util.*;

class BinaryAdd{

    public static void main(String[] args) {
        System.out.println("Enter the value to add");
        Scanner myObj = new Scanner(System.in);
        int value = myObj.nextInt();
        BinaryNode nodeobj1=new BinaryNode(4);
        nodeobj1.badd(value);
        nodeobj1.showBNodes();
    }
}