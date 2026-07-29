//Generate and display bit masks for all 32 bit positions from MSB to LSB using the right shift operator.

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0x80000000;
    int iCnt = 0;
    
    for(iCnt = 1; iCnt <= 32; iCnt++)
    {
       printf("%d : %X\n",iCnt,iMask);
       iMask = iMask >> 1;
    }

    return 0;
}