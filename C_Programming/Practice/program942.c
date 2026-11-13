#include<stdio.h>

int main(int argc, char *argv[])
{
    printf("%s\n",argv[0]);

    printf("number of arguments are : %d\n",argc); // command line argument

    return 0;
}

/*
argc → Argument Count → किती arguments आले ते सांगतो.
argv → Argument Vector → आलेले arguments store करतो.
*/