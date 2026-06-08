//Accept N numbers from user check whether that numbers contains 11 in or not.

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL Check(int Arr[],int iLength)
{
    int iCnt = 0;

    for(iCnt = 0;iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
            break;
        }
    }
    if(iCnt == iLength)
    {
        return FALSE;
    }
    else
    {
        return TRUE;
    }
}
int main()
{
    int iSize = 0,iCnt = 0;
    int *p = NULL;
    BOOL bRet = FALSE;

    printf("Enter number of elements :");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to alloacte memory");
        return -1;
    }

    printf("Enters %d elements :\n",iSize);

    for(iCnt = 0;iCnt < iSize; iCnt++)
    {
        printf("Enter element %d:",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    bRet = Check(p,iSize);

    if(bRet == TRUE)
    {
        printf("11 is present");
    }
    else
    {
        printf("11 is absent");
    }

    free(p);

    return 0;
}