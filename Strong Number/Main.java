#include <stdio.h>
int main() {
  int count,n,temp,rem,fact,sum=0;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
    fact=1;
    rem=n%10;
    for(count=1;count<=rem;count++)
    {
      fact=fact*count;
    }
    sum=sum+fact;
      n=n/10;
    }
  
  if(sum==temp)
    printf("Yes");
  else
    printf("No");
	return 0;
}