#include <stdio.h>
int main()
{
  int n , temp;
  scanf("%d",&n);
  temp=0;
 for(int i=0;i<n;i++)
 {
   for(int j=0;j<=i;j++)
   {
     if(temp==0)
     {
       printf("*");
       temp=1;
     }
     else
     {
       printf("#");
       temp=0;
     }
   }
   printf("\n");
 }
}
    