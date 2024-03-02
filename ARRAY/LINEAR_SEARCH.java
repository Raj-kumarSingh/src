package ARRAY;

public class LINEAR_SEARCH {
    public static void main(String[] args) {
        int a[]={2,3,4,5,7,8};
        int key=5;
        int index=Linerar_Search(a,key);
        if(index==-1)
        {
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key found at the "+index+" index");
        }
    }
    public static int Linerar_Search(int a[],int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
