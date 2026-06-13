
#include<stdio.h>

int main()
{
    int iNO = 751;
    int iDigit = 0;
     
    while(iNO != 0)
    {
      iDigit = iNO % 10;
      printf("%d\n",iDigit);
      iNO = iNO/10;
    }

    return 0;
}