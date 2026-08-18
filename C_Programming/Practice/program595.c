#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int main()
{
    write(1,"Jay Ganesh...",13);   // 0 index - stdin   1 index - stdout 2 index - error(console)

    return 0;

}