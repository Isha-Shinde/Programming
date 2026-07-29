//accepts number from user and toggle 4th bit
#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0;

    printf("Enter number :\n");
    scanf("%d",&iNo);

    iMask = 0x00000008;

    iNo = iNo ^ iMask;

    printf("updated number :%d\n",iNo);

    return 0;
}