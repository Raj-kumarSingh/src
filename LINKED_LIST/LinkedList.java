package LINKED_LIST;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
    public void addFirst(int data) {
        //STEP1 - Create new Node
        Node newNode=new Node(data);
        size++;
        if(head==null) {
            head = tail = newNode;
            return;
        }
            //STEP2- newNode next= head
            newNode.next=head;
            // STEP3 - head=newNode
            head=newNode;
        }
        public void addLast(int data)
        {
            Node newNode= new Node(data);
            size++;
            if(head==null)
            {
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void print()
        {
            if(head==null){
                System.out.println("null");
                return;
            }
            Node temp=head;
            while (temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void addMiddle(int idx,int data)
        {
            if(idx==0)
            {
                addFirst(data);
                return ;
            }
            Node newNode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            while(i<idx-1)
            {
                temp=temp.next;
                i++;
            }
            newNode.next= temp.next;
            temp.next=newNode;
        }
        public int removeFirst()
        {
            if(size==0)
            {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if (size==1) {
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        public int removeLast()
        {
            if(head==null)
            {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1)
            {
                int val=head.data;
                head=tail=null;
                size=0;
            }
            Node prev=head;
            for(int i=0;i<size-2;i++)
            {
                prev=prev.next;
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }
        public int itSearch(int key)
        {
            Node temp=head;
            int i=0;
            while(temp!=null)
            {
                if(temp.data==key)
                {
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }
        public int helper(Node head,int key)
        {
            if(head==null)
            {
                return -1;
            }
            if(head.data==key)
            {
                return 0;
            }
            int idx=helper(head.next,key);
            if(idx==-1)
            {
                return -1;
            }
            return idx+1;

        }
        public int recursiveSearch(int key)
        {
            return helper(head,key);
        }
        public void reverse()
        {
            Node prev=null;
            Node cur=tail=head;
            Node next;
            while (cur!=null)
            {
                next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }
            head=prev;
        }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(4);
        l1.addLast(5);
        l1.addMiddle(2,3);
        l1.removeFirst();
        l1.print();
        System.out.println(l1.size);
        l1.removeLast();
        l1.print();
        System.out.println(l1.size);
        System.out.println(l1.itSearch(4));
        System.out.println(l1.itSearch(10));
        System.out.println(l1.recursiveSearch(4));
        l1.reverse();
        l1.print();
    }

    }
