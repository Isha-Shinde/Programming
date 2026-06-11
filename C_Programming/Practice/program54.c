// Input : 5
//Output : 0 1 2 3 4 
#include<stdio.h>

void Display(int iNO)
{
     int iCnt = 0;

    for(iCnt = 1; iCnt < iNO; iCnt++)
    {
        printf("%d\t",iCnt);
    }

}
int main()
{
    int ivalue = 0;

    printf("Enter Number :\n");
    scanf("%d",&ivalue);

    Display(ivalue);

    return 0;
}