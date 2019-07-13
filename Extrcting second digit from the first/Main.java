#include <stdio.h>
int main() 
{
  int n,t;
  scanf("%d",&n);
  while(n>0)
  {
    if(n>9 && n<=99)
    {
      t=n%10;
      break;
    }
    else
      n=n/10;
    
  }
  printf("%d",t);
  
	return 0;
}