//Accept N numbers froom user and display summation of digits of each number.

#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[],int iLength)
{
    int iCnt = 0,iNo = 0,iDigit = 0;
    int iSum = 0;

    while(iCnt < iLength)
    {
        iNo = Arr[iCnt];
        iSum = 0;

        while(iNo != 0)
        {
           iDigit = iNo % 10;
           iSum = iSum + iDigit;
           iNo = iNo / 10;
        }
        printf("Summation of digit of %d is : %d\n", Arr[iCnt],iSum);

        iCnt++;
    }
}
int main()
{
    int iSize = 0,iCnt = 0;
    int *p = NULL;

    printf("Enter number of elements :");
    scanf("%d",&iSize);

    p = (int*)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements\n",iSize);

    for(iCnt = 0;iCnt < iSize;iCnt++)
    {
        printf("Enter element %d :",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    Digits(p,iSize);

    free(p);

    return 0;

}