#include<stdio.h>

int main()
{
  char str[50];
  int iRet = 0;      // Variable to store the return value of sprintf()

  iRet = sprintf(str,"jay ganesh...");

  printf("value from iRet is : %d\n",iRet);  // Prints the number of characters written

  printf("Data from str is : %s\n",str);   // Prints the string stored in 'str'

  return 0;
}