//Generate and display bit masks for all 32 bit positions using the left shift operator.

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 1;
    int iCnt = 0;
    
    for(iCnt = 1; iCnt <= 32; iCnt++)
    {
       printf("%d : %X\n",iCnt,iMask);
       iMask = iMask << 1;
    }

    return 0;
}