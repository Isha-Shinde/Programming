/*
   write a program which checks wheather first and last bit is ON or OFF.First means bit number 1 and last bit means bit number 32.
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

    iMask = 0x80000001;      

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
        printf("1st and 32nd bits is ON.\n");
    }
    else
    {
        printf("1st and 32nd bits is OFF.\n");

    }

    return 0;
}