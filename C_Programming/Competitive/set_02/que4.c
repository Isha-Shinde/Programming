#include<stdio.h>

void Display(int iNO,int iFrequeency)
{
    int i = 0;
    
    for(i = 1; i <= iFrequeency; i++)
    {
        printf("%d ", iNO);
    }
}

int main()
{
    int iValue = 0;
    int iCount = 0;

    printf("Enter Number : ");
    scanf("%d", &iValue);

    
    printf("Enter Frequency : ");
    scanf("%d",&iCount);

    Display(iValue,iCount);

    return 0;
}