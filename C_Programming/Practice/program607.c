#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

#define ERR_OPEN -1

int CountCapital(char *FileName)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fd = 0;
    int iCount = 0, i = 0;

    
    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        return ERR_OPEN;
    }

    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)       
    {
        for(i = 0; i < iRet; i++)
        {
            if(Buffer[i] >= 'A'  && Buffer[i] <= 'Z')
            {
                iCount++;
            }
        }
        
        memset(Buffer,'\0',sizeof(Buffer));
    }
    return iCount;
}

int main()
{
    
    char Fname[30] = {'\0'};
    int iRet = 0;

    printf("Entter the file name : \n");
    scanf("%[^'\n']s",Fname);

    iRet = CountCapital(Fname);

    if(iRet == ERR_OPEN)
    {
        printf("Enable to open file\n");
    }
    else
    {
        printf("Number of capital characters are :%d\n",iRet);
    }

    return 0;

}