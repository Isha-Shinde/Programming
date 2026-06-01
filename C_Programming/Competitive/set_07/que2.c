/* Accept amount in US dollar and return its corresponding value in Indian currency. 
Consider 1$ as 70 rupees.
*/

#include<stdio.h>

int DollarToINR(int iNO)
{
    int iAns = 0;

    iAns = iNO * 70;

    return iAns;       
}

int main()
{
    int iValue = 0,iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);

    printf("value in INR is %d",iRet);

    return 0;
}