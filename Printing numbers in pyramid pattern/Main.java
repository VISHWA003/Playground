#include <stdio.h>
int main() {
  int n,num=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=(n-i);j++)
    {
      printf(" ");
    }
    for(int k=1;k<=(2*i)-i;k++)
    {
      printf("%d ",num);
      num=num+1;
    }
    
    printf("\n");
  }
        
	// Type your code here
	return 0;
}