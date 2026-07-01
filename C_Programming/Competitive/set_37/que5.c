/*
   write a program which accept one number from user and toggle contents of first and last nibble of the number.return modified number.
   (Nibble is a group of four bits)
*/

#include<stdio.h>

typedef unsigned int UINT;

int ToggleBit(UINT iNo)
{
    UINT iMask = 0xF000000F;
    UINT iResult = 0;

    iResult = iNo ^ iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number :");
    scanf("%u",&iValue);

    iRet = ToggleBit(iValue);

    printf("updated number is : %u\n",iRet);

    return 0;
    
}