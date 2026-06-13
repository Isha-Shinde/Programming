//accept number from user and Display below pattern.
//  A  B  C  D  E

#include<stdio.h>

void pattern(int iNo)
{
    int iCnt = 0;
    char ch = '\0';
    
    for(iCnt = 1,ch = 'A';iCnt <= iNo;iCnt++,ch++) 
    {
        printf("%c ",ch);
    }
}
int main()
{
    int iValue = 0;

    printf("Enter Number of elements:");
    scanf("%d",&iValue);

    pattern(iValue);
    
    return 0;

}