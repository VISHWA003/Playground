#include <stdio.h>
int main() {
  int n,count,fact=1;
  scanf("%d",&n);
  for(count=1;count<=n;count++)
  {
    fact=fact*count;
  }
  printf("%d",fact);
	//Type your code
	return 0;
}