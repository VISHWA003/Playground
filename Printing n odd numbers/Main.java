#include <stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  for(int count=1;count<=2*n;count++)
  {
    if(count%2==1)
    {
	printf("%d\n",count);
    }
  }
 	return 0;
}