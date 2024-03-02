package ARRAY;

public class Trapped_RainWater {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trapped_water(height);
    }
    public static void trapped_water(int height[])
    {
        int n=height.length;
        int left_max[]=new int[height.length];
        left_max[0]=height[0];
        for(int i=1;i<n;i++)
        {
            left_max[i]=Math.max(left_max[i-1],height[i]);
        }
        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }
        int water_level;
        int trapped_water=0;
        for (int i=0;i<n;i++)
        {
            water_level=Math.min(left_max[i],right_max[i]);
            trapped_water+=water_level-height[i];
        }
        System.out.println(trapped_water);

    }
}
