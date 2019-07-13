#include <stdio.h>
int main() {
  int n,m=3;
  scanf("%d",&n);
  for(int count=1;count<=n;count++)
  {
    {
    printf("%d",count);
    }
    if((count%m==0)&&(count!=n))
  {
    printf(",");
  }
  }//Type your code
	return 0;
}