/*
   write a program which accept one number and position from user 
   and check wheather bit at that position is on or off. If bit is ON return TRUE otherwise return FALSE.

   input : 10  2
    
   output : TRUE
*/

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo,UINT iPos)
{
    UINT iMask = 0x00000001;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);
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
    UINT iValue = 0, iLocation = 0;
    BOOL bRet = FALSE;

    printf("Enter number :");
    scanf("%u",&iValue);

    printf("Enter position :");
    scanf("%u",&iLocation);

    bRet = ChkBit(iValue,iLocation);

    if(bRet == TRUE)
    {
        printf("bit is ON \n");
    }
    else
    {
        printf("bit is OFF \n");

    }
    return 0;
    
}