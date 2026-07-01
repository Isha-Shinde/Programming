/*
   write a program which checks wheather 5th and 18th bit is ON or OFF.
*/

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask= 0;
    UINT iResult = 0;

    iMask = 0x00020010;      

    iResult = iNo & iMask;

    if(iResult == iMask)
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
    UINT iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter number :");
    scanf("%u",&iValue);

    bRet = ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf("5th and 18th bit is ON.\n");
    }
    else
    {
        printf("5th and 18th bit is OFF.\n");

    }

    return 0;
}