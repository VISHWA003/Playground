/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int n;
 scanf("%d",&n);
 int a[n];
 for(int i=0;i<n;i++)
 {
   scanf("%d",&a[i]);
 }
  print_detail(a,n);
  return 0;
}
void print_detail(int a[],int n)
{
  int c=0;
 for(int i=0;i<3;i++)
 {
   c=c+a[i];
 }
  int d=0;
 for(int i=3;i<n;i++)
 {
   d=d+a[i];
 }
 if(c==d)
 {
   printf("Perfect Batch");
 }
 else
 {
   printf("Not a Perfect Batch");
 }
  
}