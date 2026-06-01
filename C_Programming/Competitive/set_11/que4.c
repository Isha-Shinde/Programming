//write a program which accept range from user and return addition of all even numbers in between  that range.
//(range should contains positive numbers only)

#include<stdio.h>

int RangeSumEven(int iStart, int iEnd)
{
    int iSum = 0;

    while(iStart <= iEnd)
    {
        if(iStart % 2 == 0)
        {
            iSum = iSum + iStart;
        }
        iStart++;
    }
    return iSum;

}

int main()
{
    int iValue1 = 0, iValue2 = 0,iRet = 0;

    printf("Enter starting point :");
    scanf("%d",&iValue1);

    
    printf("Enter ending point :");
    scanf("%d",&iValue2);

    iRet = RangeSumEven(iValue1,iValue2);

    printf("Additio is :%d",iRet);

    return 0;
    
}

