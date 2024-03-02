package FUNCTION;

public class dec_to_bin {
    public static void decbin(int decm)
    {
        int pow=0;
        int mydec=decm;
        int bin=0;
        while(decm>0)
        {
            int rem=decm%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            decm=decm/2;

        }
        System.out.println("The binary no of "+mydec+" is "+bin);

    }

    public static void main(String[] args) {
        decbin(24);
    }
}
