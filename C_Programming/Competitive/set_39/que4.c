/*
    Consider singly linear linkedlist to solve below statement.
    Count how many times a number appears.
*/

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d | -> ",first->data);
        first = first->next;
    }
    printf("NULL\n");
}

int Count(PNODE first)
{
    int iCount = 0;

    while(first != NULL)
    {
        iCount++;
        first = first->next;
    }
    return iCount;
}

int CountFrequency(PNODE first,int iNO)
{
    int iCount = 0;

    while(first != NULL)
    {
        if(first->data == iNO )
        {
            iCount++;
        }
        first = first->next;
    }
    return iCount;

}

void InsertFirst(PPNODE first , int iNO)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNO;
    newn->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;
    }
}

void InsertLast(PPNODE first, int iNO)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNO;
    newn->next = NULL;

    if(*first == NULL)
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
        
    }
}

void InsertAtPos(PPNODE first, int iNO,int iPos)
{
    int iCount = 0;
    int i = 0;

    PNODE newn = NULL;
    PNODE temp = NULL;

    iCount = Count(*first);

    if((iPos < 1) || (iPos > iCount+1))
    {
        printf("invalid position\n");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(first,iNO);
    }
    else if(iPos == iCount+1)
    {
        InsertLast(first,iNO);
    }
    else
    {
        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = iNO;
        newn->next = NULL;

        temp = *first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }
        newn->next = temp->next;
        temp->next = newn;
    }
}

void DeleteFirst(PPNODE first)
{
    PNODE temp = NULL;

    if(*first == NULL)
    {
        return;
    }
    else if((*first)->next == NULL)
    {
        free(*first);
        *first = NULL;
    }
    else
    {
        temp = *first;
        *first = (*first)->next;
        free(temp);
    }

}

void DeleteLast(PPNODE first)
{   
    PNODE temp = NULL;

    if(*first == NULL)
    {
        return;
    }
    else if((*first)->next == NULL)
    {
        free(*first);
        *first = NULL;
    }
    else
    {
        temp = *first;

        while(temp->next->next != NULL)
        {
            temp = temp->next;
        }
        free(temp->next);
        temp->next = NULL;
        
    }
}

void DeleteAtPos(PPNODE first,int iPos)
{
    int iCount = 0;
    int i = 0;

    PNODE temp = NULL;
    PNODE target = NULL;

    iCount = Count(*first);

    if((iPos < 1) || (iPos > iCount))
    {
        printf("Invalid position\n");
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst(first);
    }
    else if(iPos == iCount)
    {
        DeleteLast(first);
    }
    else
    {
        temp = *first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }
        target = temp->next;

        temp->next = target->next;
        free(target);
    }

}

int main()
{
    PNODE head = NULL;
    int iRet = 0;
    int iRett = 0;

    InsertFirst(&head,101);
    InsertFirst(&head,51);
    InsertFirst(&head,101);
    InsertFirst(&head,101);

    Display(head);
    iRet = Count(head);
    printf("number of nodes are : %d\n",iRet);

    iRett = CountFrequency(head,101);
    printf("number of frequency are : %d\n",iRett);

    InsertLast(&head,111);
    InsertLast(&head,121);
    Display(head);
    iRet = Count(head);
    printf("number of nodes are : %d\n",iRet);

    InsertAtPos(&head,105,3);
    Display(head);
    iRet = Count(head);
    printf("number of nodes are : %d\n",iRet);

    DeleteFirst(&head);
    Display(head);
    iRet = Count(head);
    printf("number of nodes are : %d\n",iRet);

    DeleteLast(&head);
    Display(head);
    iRet = Count(head);
    printf("number of nodes are : %d\n",iRet);

    DeleteAtPos(&head,3);
    Display(head);
    iRet = Count(head);
    printf("number of nodes are : %d\n",iRet);

    return 0;
}