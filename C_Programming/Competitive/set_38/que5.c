/*
   write a program which accept one number from user and range of positions from user .
   toggle all bits from that range.

   input : 897  9  13
   toggle all bits from position 9 to 13 of input number.
*/

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBitRange(UINT iNo, UINT iStart, UINT iEnd)
{
    UINT iMask = 0;
    UINT iResult = 0;
    UINT i = 0;

    if((iStart < 1) || (iEnd > 32) || (iStart > iEnd))
    {
        return iNo;
    }

    for(i = iStart; i <= iEnd; i++)
    {
        iMask = iMask | (0x1 << (i - 1));
    }

    iResult = iNo ^ iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0;
    UINT iStart = 0;
    UINT iEnd = 0;
    UINT iRet = 0;

    printf("Enter number : ");
    scanf("%u", &iValue);

    printf("Enter starting position : ");
    scanf("%u", &iStart);

    printf("Enter ending position : ");
    scanf("%u", &iEnd);

    iRet = ToggleBitRange(iValue, iStart, iEnd);

    printf("Updated number is : %u\n", iRet);

    return 0;
}