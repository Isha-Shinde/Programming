#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>   //only Linux based OS
int main()
{
    int fd = 0;

    fd = open("Marvellous.txt",O_RDONLY);

    if(fd == -1)
    {
        printf("Enable to open file\n");
    }
    else
    {
        printf("Files gets successfully opened with fd : %d\n",fd);
        close(fd);
    }

    return 0;
}