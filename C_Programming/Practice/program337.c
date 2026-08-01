//accepts number from user and off its 4th bit if it is on.

#include<stdio.h>

typedef unsigned int UINT;

// Position : 4

int main()
{
    UINT iNo = 0;
    UINT iMask = 0xFFFFFFF7;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iNo = iNo & iMask;

    printf("Updated number : %d\n",iNo);

    return 0;
}