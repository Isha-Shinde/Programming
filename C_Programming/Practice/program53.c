// Input : 5
//Output : 1 2 3 4 5
#include<stdio.h>

void Display(int iNO)
{
     int iCnt = 0;

    for(iCnt = 0; iCnt <= iNO; iCnt++)
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