#include <stdio.h>
int main()
{
  int n;
  scanf("%d",&n); 
  for(int i=1;i<=n;i++)
  {
    int a=1;
    for(int j=1;j<=n;j++)
    { 
    if((a==i)||(a==n-(i-1)))
       {
       printf("*");
    }
       else
       {
       printf(" ");
       }a++;
    }
     
  printf("\n");
  }
  
  return 0;
}