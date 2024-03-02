package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1=new Pen();
        //p1.setColor("Blue");
        p1.color="Red";
        System.out.println(p1.color);
        p1.setTip(12);
        System.out.println(p1.tip);
    }
    }
    class Pen {
        String color;
        int tip;
        void setColor(String newColor)
        {
            color=newColor;
        }
        void setTip(int newTip)
        {
            tip=newTip;
        }
    }
