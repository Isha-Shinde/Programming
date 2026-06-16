#include<stdio.h>

void CallByValue(int iNo)
{
    iNo++;
} 
int main()
{
    int iValue = 11;

    CallByValue(iValue);       //callbyvalue(11)

    printf("value after function call : %d\n",iValue);
    
    return 0;
}