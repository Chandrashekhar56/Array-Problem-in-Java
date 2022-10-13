import java.util.*;
public class test{
public static void main(String[] args) {

    int []arr=new int[1000];
    Scanner s=new Scanner(System.in);
    int i,j,input=0,count=0;
    for(i=0;input>=0;i++)
    {
      arr[i]=s.nextInt();
      input=arr[i];
      arr[i]=input-0;
      count++;
    }
    for(i=0;i<count-1;i++)
    {
      for(j=i+1;j<count-1;j++)
      {
        if(arr[i]<arr[j])
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println("This is greatest element in this array: " +arr[0]);
}
}
