package LINKED_LIST;

public class Double_LinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        public void addLast(int data)
        {
            Node newNode=new Node(data);
                size++;
                if(head==null)
                {
                    head=tail=newNode;
                    return;
                }
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public int removeFirst()
        {
            if(head==null)
            {
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
            }
            if(size==1)
            {
                int val=head.data;
                head=tail=null;
                size--;
                return val;
            }
            int val=head.data;
            head=head.next;
            head.prev=null;
            size--;
            return val;
        }
//        public int removeLast()
//        {
//            if(head==null)
//            {
//                System.out.println("Dll is empty");
//                return -1;
//            }
//            int val;
//            if(size==1)
//            {
//                 val=head.data;
//                head=tail=null;
//                size--;
//            }else {
//                Node temp = tail.prev;
//                val = temp.data;
//               tail.prev = temp.prev;
//                //tail=tail.prev;
//                if (temp.prev != null) {
//                    temp.prev.next = tail;
//                } else {
//                    head = tail;
//                }
//                temp.prev = temp.next = null;
//            }
//            size--;
//            return val;
//        }
    public int removeLast() {
        if (head == null)
            {
                System.out.println("Dll is empty");
                return -1;
            }
            int val;
           if(size==1) {
               val = head.data;
               head = tail = null;
               size--;
           }
           else {
               val=tail.data;
               tail=tail.prev;
               tail.next=null;
               size--;
           }
           return val;
    }
    public void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

        public static void main(String[] args) {
            Double_LinkedList dll = new Double_LinkedList();
            dll.addFirst(3);
            dll.addFirst(2);
            dll.addFirst(1);
           dll.print();
//            dll.removeFirst();
//            dll.print();
//            dll.addLast(4);
//            dll.print();
//            dll.removeLast();
//            dll.print();
            dll.reverse();
            dll.print();
        }
}
