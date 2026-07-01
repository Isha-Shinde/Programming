/*
   write a program which checks wheather 7th,8th and 9th bit is ON or OFF.
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

    iMask = 0x1C0;      

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
        printf("7th,8th and 9th bits is ON.\n");
    }
    else
    {
        printf("7th,8th and 9th bits is OFF.\n");

    }

    return 0;
}