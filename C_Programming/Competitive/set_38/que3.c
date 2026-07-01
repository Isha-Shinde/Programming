/*
   write a program which accept one number from user and check wheather 9th or 12th bit is ON or OFF.

    input : 257     output : TRUE

*/

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0x00000900;
    UINT iResult = 0;

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
    UINT iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter number :");
    scanf("%u",&iValue);

    bRet = ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf("TRUE \n");
    }
    else
    {
        printf("False \n");

    }
    return 0;
    
}