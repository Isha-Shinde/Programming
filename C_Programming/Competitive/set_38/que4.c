/*
   Write a program which accepts one number and two positions from user
   and checks whether bit at first or bit at second position is ON or OFF.

   Input : 10 2 7
   Output : TRUE
*/

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo, UINT iPos1, UINT iPos2)
{
    UINT iMask1 = 0x00000001;
    UINT iMask2 = 0x00000001;
    UINT iMask = 0;
    UINT iResult = 0;

    if((iPos1 < 1) || (iPos1 > 32) || (iPos2 < 1) || (iPos2 > 32))
    {
        return FALSE;
    }

    iMask1 = iMask1 << (iPos1 - 1);
    iMask2 = iMask2 << (iPos2 - 1);

    iMask = iMask1 | iMask2;

    iResult = iNo & iMask;

    if(iResult != 0)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    UINT iValue = 0, iLocation1 = 0, iLocation2 = 0;
    BOOL bRet = FALSE;

    printf("Enter number : ");
    scanf("%u", &iValue);

    printf("Enter position1 : ");
    scanf("%u", &iLocation1);

    printf("Enter position2 : ");
    scanf("%u", &iLocation2);

    bRet = ChkBit(iValue, iLocation1, iLocation2);

    if(bRet == TRUE)
    {
        printf("TRUE\n");
    }
    else
    {
        printf("FALSE\n");
    }

    return 0;
}