#include<stdio.h>

void Display()
{
    int i = 5;

    while(i >= 1)
    {
        printf("%d ", i);
        i--;
    }
}

int main()
{
    Display();
    return 0;
}