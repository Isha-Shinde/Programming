//accepts number and accept the position from user and toggle bit at that number

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0x1;
    UINT iPos = 0;

    printf("Enter number :\n");
    scanf("%d",&iNo);

    printf("enter the bit position :");
    scanf("%d",&iPos);

    iMask = iMask << (iPos -1);

    iNo = iNo ^ iMask;

    printf("updated number :%d\n",iNo);

    return 0;
}