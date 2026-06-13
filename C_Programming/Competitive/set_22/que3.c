/*accept number from user and Display below pattern.

Input : 5

Output : 1  *  2  *  3  *  4  *  5  *

*/
#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    char ch = '*';
    
    for(iCnt = 1;iCnt <= iNo;iCnt++) 
    {
        printf("%d %c",iCnt,ch);
    }
}
int main()
{
    int iValue = 0;

    printf("Enter Number of elements:");
    scanf("%d",&iValue);

    Pattern(iValue);
    
    return 0;

}