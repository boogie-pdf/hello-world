public class chaosCodez {

public static void doStuff(int wat[]) {

for(int i=0;i<wat.length-1;i++)
{
for(int j=0;j<wat.length-i-1;j++)
    {
if(wat[j] > wat[j+1]) // Fixed for ascending order
{
int tmp=wat[j];
wat[j]=wat[j+1];
wat[j+1]=tmp;
}
    }

}

}

public static void main(String args[]){
int nums[]={5,3,9,1,0,12,4};
doStuff(nums);
System.out.println("Sorted?");
for(int i = 0;i<nums.length;i++){System.out.print(nums[i]+" ");}
}
}
