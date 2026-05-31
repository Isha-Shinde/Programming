#include<stdio.h>

void Display(int iNO)
{
    while(iNO > 0)
    {
        printf("*");
        iNO--;
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