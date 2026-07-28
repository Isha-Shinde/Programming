//1.accept number from user and check wheather third bit of that number is on or off.

#include<stdio.h>

int main()
{
    int iNo = 0;
    int iMask = 4;
    int iAns = 0;

    printf("Enter number :\n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("Third bit is ON\n");
    }
    else
    {
        printf("Third bit is OFF\n");
    }

    return 0;
}