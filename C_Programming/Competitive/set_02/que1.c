#include<stdio.h>

void Display(int iNO)
{
    int iCnt = 0;

    while(iCnt < iNO)
    {
        printf("*");
        iCnt++;
    }
}
int main()
{
    int iValue = 0;

    printf("Enter Number:");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}

