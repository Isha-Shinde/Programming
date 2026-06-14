/*accept number from user and Display below pattern.

Input : 4

Output : #  1  *  #  2  *  #  3  *  #  4  *

*/
#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    
    for(iCnt = 1;iCnt <= iNo;iCnt++)
    {
        printf("%s %d %s", "# ", iCnt ,"* " );
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