//write a program which accept number from user and return summation of all its non factors.

#include<stdio.h>

int NonFact(int iNO)
{
    int iCnt = 0;
    int iSum = 0;
    
    for(iCnt = 1; iCnt <= iNO; iCnt++)
    {
        if((iNO % iCnt) != 0)
        {
            iSum = iSum + iCnt;   
        }
    }
        return iSum;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = NonFact(iValue);

    printf("%d", +iRet);

    return 0;
}