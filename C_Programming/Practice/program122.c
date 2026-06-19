#include<stdio.h>
#include<stdlib.h>

int Summation(int Arr[], int iSize)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 0;iCnt < iSize; iCnt++)
    {
        iSum = iSum + Arr[iCnt];
        
    }
    return iSum;
}
int main()
{
    int *Brr = NULL;
    int iLength = 0, iCnt = 0,iRet = 0;

    // step 1 : Accept the number of elements
    printf("Enter number of elements :\n");
    scanf("%d",&iLength);

    // step 2 : allocate the memory
    Brr = (int *)malloc(iLength * sizeof(int));

    //step 3 : accepts the value from user
    printf("Enter the elements : \n");
    for(iCnt = 0;iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    //step 4 : use the memory (LOGIC)

    iRet = Summation(Brr,iLength);

    printf("Addition is : %d\n",iRet);

    //step 5 : deallocated the memory
    free(Brr);

    return 0;
}