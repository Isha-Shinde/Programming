/*
   write a progra which displays ASCII table.
   Table contains symbol,Decimal,Hexadecimal and octal representation of every member from 0 to 255

*/

#include<stdio.h>

void DisplayASCII()
{
    int i = 0;

    printf("Symbol\tDecimal\tHexadecimal\tOctal\n");

    for(i = 0; i <= 255; i++)
    {
        if(i < 32 || i == 127)
        {
            printf(" \t%d\t%x\t\t%o\n", i, i, i);  // ASCII values 0-31 and 127 are non-printable, so display only their numeric representations
        }
        else
        {
            printf("%c\t%d\t%x\t\t%o\n", i, i, i, i);
        }
    }
}

int main()
{
    DisplayASCII();

    return 0;
}