//accepts number from user and toggle 11th bit
#include<stdio.h>

typedef unsigned int UINT;

//position : 11
int main()
{
    UINT iNo = 0;
    UINT iMask = 0;

    printf("Enter number :\n");
    scanf("%d",&iNo);

    iMask = 0x400;

    iNo = iNo ^ iMask;

    printf("updated number :%d\n",iNo);

    return 0;
}