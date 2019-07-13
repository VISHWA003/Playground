#include<stdio.h>
int square(int m)
{
  int count=0;
   for(int i=1;i<=m;i++)
  {
    count=count+i;
  }
  return count;
}
  
int main()
{
  int n;
  scanf("%d",&n);
int sum=square(n);
  n=sum;
  printf("%d",n);
}
    