public class Array_MaxProductSubArray
{
    public static void main(String[] args) {
        int a []= {2,3,-2,4};
        long max= a[0];
        long min = a[0];
        long result = a[0];
    for (int i=1;i<a.length;i++)
    {
        if (a[i]==0)
        {
            max=0;
            min=0;
            continue;
        }
        long temp1= a[i]*max;
        long temp2 = a[i]*min;

        max= Math.max(temp1,temp2);
        max= Math.max(a[i],max);

        min = Math.min(temp1,temp2);
        min= Math.min(a[i],min);
        result = Math.max(result,max);

    }
        System.out.println(result);

    }
}
