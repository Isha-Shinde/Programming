//1.accept number from user and check wheather third bit of that number is on or off.

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 4;
    UINT iAns = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("3rd bit is ON\n");
    }
    else
    {
        printf("3rd bit is OFF\n");
    }

    return 0;
}