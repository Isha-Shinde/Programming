//Write a program which accept number from user and print numbers till that number.

#include<stdio.h>

int Display(int iNO)
{
    int iCnt = 0;
    
    for(iCnt = 1; iCnt <= iNO; iCnt++)
    {
        printf("%d\n",iCnt);
    }
        
}

int main()
{
    int iValue = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}