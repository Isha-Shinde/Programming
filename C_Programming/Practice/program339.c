//accepts number from user and off its 23th bit if it is on.

#include<stdio.h>

typedef unsigned int UINT;

// bit position : 23
int main()
{
    UINT iNo = 0;
    UINT iMask = 0xFFBFFFFF;
    UINT iPos = 0;

    printf("Enter number :\n");
    scanf("%d",&iNo);

    iNo = iNo & iMask;

    printf("updated number :%d\n",iNo);

    return 0;
}