//write a program which accept number from user and display its multiplication of factors.

#include<stdio.h>

int MultiFact(int iNO)
{
    int iCnt = 0;
    int iMult = 1;
    
    for(iCnt = 1; iCnt <= (iNO / 2); iCnt++)
    {
        if((iNO % iCnt)==0)
        {
            iMult = iMult * iCnt;
        }
    }
        return iMult;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = MultiFact(iValue);

    printf("%d",iRet);

    return 0;
}