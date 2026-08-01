//accepts number and position from user and off that bit if it is on.

#include<stdio.h>

typedef unsigned int UINT;

// position : 4

UINT OffBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0xFFFFFFF7;
    UINT iResult = 0;

    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;
    }

    iMask = iMask << (iPos - 1);

    iResult = iNo ^ iMask;

    return iResult;
}
int main()
{
    UINT iValue = 0, iRet = 0, iLocation = 0;

    printf("Enter number :\n");
    scanf("%d",&iValue);

    printf("enter the bit position :");
    scanf("%d",&iLocation);

    iRet = OffBit(iValue,iLocation);

    printf("updated number is :%d\n",iRet);

    return 0;
}