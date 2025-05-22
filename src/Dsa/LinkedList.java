package Dsa;

public class LinkedList {

    public Node head;

    public LinkedList(){
        this.head=null;
    }

    public void addFirst(int data){

        Node node = new Node(data);
        if(this.head==null)
            this.head=node;
        else {
            node.next=this.head;
            this.head=node;
        }

    }

    public  void add(int data){

        Node node = new Node(data);
        if(this.head==null)
            this.head=node;
        else{
            Node tn = head;
            while(tn.next!=null)
                tn=tn.next;
            tn.next=node;
        }
    }

    public  void printList(){
        if(this.head==null)
            System.out.println("Empty LinkedList");
        else{
            Node tn = this.head;
            while(tn!=null){
                System.out.print(tn.data+" ");
                tn=tn.next;
            }
        }
    }

    public boolean search(int target){

        if(this.head==null)
            System.out.println("Empty LinkedList");
        else{
            Node tn = this.head;
            while(tn!=null){
                if(tn.data==target)
                    return true;
                tn=tn.next;
            }
        }
        return false;
    }

    public int midElement(){

        int llSize = size(),count=1;

        if(this.head==null && llSize==0)
            return -1;

        int mid = llSize/2;

        Node tn = head;
        while(count<=mid){
            tn=tn.next;
            count++;
        }
        return tn.data;
    }

    public void deleteNode(int target){
        if(this.head==null)
            System.out.println("Empty LinkedList");
        else{
            if(head.data==target)
                head=head.next;
            else{
                Node tn = head;
                while (tn.next.data!=target)
                    tn=tn.next;
                Node tmp = tn.next;
                tn.next=tn.next.next;
                tmp.next=null;
            }
        }
    }

    public int size(){

        int count=0;

        if(this.head==null)
            return count;
        Node tn = head;
        while(tn!=null){
            tn=tn.next;
            count++;
        }
        return count;
    }



    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        Node node = new Node();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        linkedList.add(80);
        linkedList.add(90);
        linkedList.add(100);

//        linkedList.addFirst(5);

//        if(linkedList.search(10))
//            System.out.println("Element is present in th LL");
//        else
//            System.out.println("Element is not present in the LL");

//        linkedList.deleteNode(10);
//        linkedList.deleteNode(50);

//        linkedList.printList();

//        System.out.println(linkedList.size());

        System.out.println(linkedList.midElement());

    }

}
