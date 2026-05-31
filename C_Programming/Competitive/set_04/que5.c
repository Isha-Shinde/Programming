/*write a program which accept number from user and return diference between 
summation of all its factors and non factors.*/

#include<stdio.h>

int FactDiff(int iNO)
{
    int iCnt = 0;
    int iFactSum = 0;
    int iNonFactSum = 0;
    
    for(iCnt = 1; iCnt < iNO; iCnt++)
    {
        if((iNO % iCnt) == 0)
        {
            iFactSum = iFactSum + iCnt;
        }
        else
        {
            iNonFactSum = iNonFactSum + iCnt;   
        }

    }
        return (iFactSum - iNonFactSum);
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("%d", iRet);

    return 0;
}