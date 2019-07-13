#include <stdio.h>
int main(){
  int n;
  scanf("%d",&n);
  for(int count=1;count<=n;count++)
  {
    for(int cmt=1;cmt<=count;cmt++)
    {
      printf("%d",count);
    }
    printf("\n");
  }
	// Type your code here
  	return 0;
}