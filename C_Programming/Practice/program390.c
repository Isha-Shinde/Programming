#include<stdio.h>  //1
#include<stdlib.h>
 
#pragma pack(1)
struct node //2
{
    int data;
    struct node *next;
    struct node *prev;           // $
};
// 3
typedef struct node NODE;        
typedef struct node* PNODE;
typedef struct node** PPNODE;

// 5
int Count(PNODE first) //9
{
    int iCount = 0;

    while(first != NULL)
    {
        iCount++;
        first = first->next;
    }
    return iCount;
}

void Display(PNODE first)  //8
{
    printf("\nNULL <=> ");

    while(first != NULL)
    {
        printf(" | %d | <=> ",first->data);
        first = first->next;
    }
    printf("NULL\n");

}

void InsertFirst(PPNODE first,int iNo)
{
    // 6
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;    //$

    if(NULL == *first)                       //LL is empty
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        (*first)->prev = newn;     //$
        *first = newn;
    }
}

void InsertLast(PPNODE first,int iNo)
{
    // 7
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;    //$


    if(NULL == *first)                                  //LL is empty
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
        newn->prev = temp;    //$
    }
    
}

void InsertAtPos(PPNODE first,int iNo,int iPos)
{
    
}

void DeleteFirst(PPNODE first)
{

}

void DeleteLast(PPNODE first)
{
    
}
void DeleteAtPos(PPNODE first,int iPos)
{
    
}
int main()
{    // 4
    PNODE head = NULL;
    int iRet = 0;
    
    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    InsertLast(&head,101);
    InsertLast(&head,111);
    InsertLast(&head,121);

    Display(head);
    
    iRet = Count(head);
    printf("number of nodes are :%d\n",iRet);



    return 0;
}