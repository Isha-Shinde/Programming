#include<stdio.h>

void Display()
{
    auto int i = 0;                  // auto storage class

    i = 1;
    while(i <= 4)
    {
        printf("Jay Ganesh\n");
        i++;
    }
}

int main()
{
    Display();

    return 0;
}