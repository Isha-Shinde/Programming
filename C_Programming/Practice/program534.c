// 571
// 5 7 1

#include<stdio.h>

void Display(int iNo)
{
    int iDigit = 0;
    
    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iNo = iNo / 10;

        Display(iNo);              // head recurion
        printf("%d\n",iDigit);
    }
}
int main()
{
    int iValue = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);
    
    Display(iValue);

    return 0;
}