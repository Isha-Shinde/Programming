//accepts number from user and off its 13th bit if it is on.

#include<stdio.h>

typedef unsigned int UINT;

// bit position : 13
int main()
{
    UINT iNo = 0;
    UINT iMask = 0xFFFFEFFF;

    printf("Enter number :\n");
    scanf("%d",&iNo);

    iNo = iNo & iMask;

    printf("updated number :%d\n",iNo);

    return 0;
}