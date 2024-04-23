package LINKED_LIST;

public class MergeSortOnLL {
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
    private Node getMid(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }



        return mergedLL.next;
    }
    public Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        return merge(newLeft,newRight);
    }
    public void zigZig(){
        //Find mid
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node Mid=slow;
        Node curr= Mid.next;
        Mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while (left!=null && right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
    }
    public static void main(String[] args) {
        MergeSortOnLL ml=new MergeSortOnLL();
        ml.addFirst(5);
        ml.addFirst(4);
        ml.addFirst(3);
        ml.addFirst(2);
        ml.addFirst(1);
        ml.print();
//        head=ml.mergeSort(head);
//        ml.print();
        ml.zigZig();
        ml.print();
    }
}
