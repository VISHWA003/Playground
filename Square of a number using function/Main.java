#include<stdio.h>
int sqod(int m)
{
  int a;
  a=m*m;
  return a;
}
int main()
{
  int n;
  scanf("%d",&n);
  int square=sqod(n);
n=square;
  printf("%d",n);
  return 0;
}
    
  