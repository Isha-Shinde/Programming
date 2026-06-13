
#include<stdio.h>

void DisplayDigits(int iNO)
{
   int iDigit = 0;
     
    while(iNO != 0)
    {
      iDigit = iNO % 10;
      printf("%d\n",iDigit);
      iNO = iNO/10;
    }
}
int main()
{
    int ivalue = 0;

    printf("Enter Number : \n");
    scanf("%d",&ivalue);

    DisplayDigits(ivalue);
    return 0;
}