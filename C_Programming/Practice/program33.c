#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    
    //FILTER
    if(iNo < 0)
    {
        printf("Invalid input\n");
        return;
    }
    for(iCnt = 0; iCnt <= iNo; iCnt++)
    {
        printf("%d \n",iCnt);
    }   
}
int main()
{
    
    int iValue = 0;

    printf("Enter the Frequency : ");
    scanf("%d",&iValue);

    Display(iValue);   //funtion call
     
    return 0;
}