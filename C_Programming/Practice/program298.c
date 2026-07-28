#include<stdio.h>

//call by address
void swap(int *Ptr1, int *Ptr2)
{
   int temp = 0;
   
   temp = *Ptr1;
    *Ptr1 = *Ptr2;
    *Ptr2 = temp;
}
int main()
{
    int i = 11;
    int j = 21;
    
    swap(&i,&j);
    printf("%d\n",i);
    printf("%d\n",j);
    return 0;
}