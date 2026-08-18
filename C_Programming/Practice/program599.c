#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

//Change in parameter
void DisplayFile(char *FileName)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fd = 0;

    
    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Enable to open file\n");
        return;
    }

    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)       
    {
        write(1,Buffer,iRet);              
        memset(Buffer,'\0',sizeof(Buffer));
    }
    close(fd);
}

int main()
{
    
    char Fname[30] = {'\0'};

    printf("Entter the file name : \n");
    scanf("%[^'\n']s",Fname);

    DisplayFile(Fname);

    return 0;

}