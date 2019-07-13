#include <stdio.h>
int main() {
  int n,sum,a,b;
  scanf("%d",&n);
   b=n%10;
  while(n>0)
  {
    if(n>9 && n<=99)
    {
      a=n/10;
      break;
    }
    else
      n=n/10;
  }
    sum=a+b;
  printf("%d",sum);
	//Type your code
	return 0;
}