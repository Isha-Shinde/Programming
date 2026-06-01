/*
   write a program which accept range from user and Display all numbers in between that range 
   in reverse order.
*/

#include<stdio.h>

void RangeDisplayRev(int iStart, int iEnd)
{
    while(iEnd >= iStart)
    {
        printf("%d\n",iEnd);
        iEnd--;
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter starting point :");
    scanf("%d",&iValue1);

    
    printf("Enter ending point :");
    scanf("%d",&iValue2);

    RangeDisplayRev(iValue1,iValue2);

    return 0;
    
}

