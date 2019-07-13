#include <stdio.h>
int main()
{
  char str[100];
  scanf("%[^\n]s",str);
  int len=strlen(str);
  int i,j=0;
  int arr[26];
  for(i=0;i<=25;i++)
  {
    arr[i]=0;
  }
  for(i=0;i<len;i++)
  {
    if(str[i]>='a'&&str[i]<='z')
    {
      j=str[i]-'a';
        arr[j]++;
    }
  }
  for(i=0;i<26;i++)
  {
    if(arr[i]==0)
    {
      printf("%c ", i+ 'a');
      
    }
  }
  
   return 0;
}