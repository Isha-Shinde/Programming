//Accept N numbers from user and return the difference between largest number and smallest number.

#include<stdio.h>
#include<stdlib.h>

#define FALSE 0
#define TRUE 1

typedef int BOOL;

int Difference(int Arr[],int iLength)
{
    int iCnt = 0;
    int iMax = 0,iMin = 0;
    
    iMax = Arr[0];
    iMin = Arr[0];

    for(iCnt = 0;iCnt < iLength;iCnt++)
    {
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }

        if(Arr[iCnt] < iMin)
        {
            iMin = Arr[iCnt];
        }
    }
    return iMax - iMin;
}
int main()
{
    int iSize = 0,iCnt = 0,iRet = 0;
    int *p = NULL;

    printf("Enter number of elements :");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to alloacte memory");
        return -1;
    }

    printf("Enters %d elements \n",iSize);

    for(iCnt = 0;iCnt < iSize; iCnt++)
    {
        printf("Enter element %d :",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    iRet = Difference(p,iSize);

    printf("Difference is %d",iRet);

    free(p);

    return 0;
}