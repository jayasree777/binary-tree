import java.util.*;

class BinaryNode{

    BinaryNode right=null;
    BinaryNode left=null;
    int value;

    BinaryNode(int value){
        this.value=value;
        this.right=null;
        this.left=null;
    }

    void badd(int value){
        if(value>this.value)
            rightInsert();
        else
            leftInsert();
        }

    public boolean hasBNext(){
    
        if (this.right==null || this.left==null){
            return false;
        
        else
            return true;
        }

        

    void rightInsert(){

        BinaryNode bnoder = this;
        while (bnoder.hasBNext()) {
                bnoder=bnoder.right;
                System.out.print("RIGHT:"+bnoder.value+"\n");     
        }
        bnoder.right= new BinaryNode(value);
        
        }

        void leftInsert(){

        BinaryNode bnodel = this;
        while (bnodel.hasBNext()) {
                bnodel=bnodel.left;
                System.out.print("LEFT:"+bnodel.value+"\n");
        }
        bnodel.left=new BinaryNode(value);
        
        }
}