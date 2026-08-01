//Demonstrate the Bitwise NOT (~) operator using the hexadecimal value 0xFFFFFFBF.

#include<stdio.h>

typedef unsigned int UINT;

// befor : 1 0 1 1 0 0 0 0
// after : 0 1 0 0 0 0 0 0  - 40(in hexadecimal)

int main()
{
    UINT iMask = 0xFFFFFFBF;

    printf("Before : %X\n",iMask);

    iMask = ~iMask;

    printf("After : %X\n",iMask);

    return 0;
}