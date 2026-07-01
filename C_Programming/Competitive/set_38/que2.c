/*
   write a program which accept two numbers from user and display position of common ON bits fro that two numbers.

    input :  10  15       (1010  1111)
    output : 2   4

*/

#include<stdio.h>

typedef unsigned int UINT;

void CommonBit(UINT iNo1,UINT iNo2)
{
    UINT iMask = 0x00000001;
    int iPos = 1;

    while(iPos <= 32)
    {
        if((iNo1 & iMask) && (iNo2 & iMask))
        {
            printf("%d\n",iPos);
        }

        iMask = iMask << 1;
        iPos++;
    }
}


int main()
{
    UINT iValue1 = 0,iValue2 = 0;

    printf("Enter number1 :");
    scanf("%u",&iValue1);

    printf("Enter number2 :");
    scanf("%u",&iValue2);

    CommonBit(iValue1,iValue2);
    return 0;
}