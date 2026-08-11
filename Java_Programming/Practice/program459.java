class program459
{
    public static void main(String A[])
    {
        SinglyCL sobj = new SinglyCL();
        int iRet = 0;

        sobj.InsertFirst(101);
        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("number of nodes are :"+iRet);

        sobj.InsertLast(111);
        sobj.InsertLast(121);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("number of nodes are :"+iRet);

        sobj.DeleteFirst();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("number of nodes are :"+iRet);
        
        sobj.DeleteLast();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("number of nodes are :"+iRet);

        sobj.InsertAtPos(105, 4);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("number of nodes are :"+iRet);
        
        sobj.DeleteAtPos(4);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("number of nodes are :"+iRet);

    }
}

class node
{
    public int data;
    public node next;

    node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyCL
{
    private node first;
    private node last;
    private int iCount;

    public SinglyCL()
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        if(first == null & last == null)
        {
            return;
        }

        do
        {
            System.out.print("| "+temp.data+" | ->");
            temp = temp.next;
        }while(temp != last.next);

        System.out.println(" ");
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertFirst(int ino)
    {
        node newn = new node(ino);

        if(first == null & last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        last.next = first;
        iCount++;
    }

    public void InsertLast(int ino)
    {
        node newn = new node(ino);

        if(first == null & last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            last = newn;
        }
        last.next = first;
        iCount++;
    }

    public void InsertAtPos(int ino,int iPos)
    {
        node newn = new node(ino);
        int i = 0;

        if((iPos < 1) || (iPos > iCount+1))
        {
            System.out.println("Invalid position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(ino);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(ino);
        }
        else
        {
            node temp = first;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;

            iCount++;
        }
    }
    
    public void DeleteFirst()
    {
        if(first == null & last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
        }
        last.next = first;
        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null & last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            node temp = first;

            while(temp.next != last)
            {
                temp = temp.next;
            }
            last = temp;
        }
        last.next = first;
        iCount--;
    }
    
    public void DeleteAtPos(int iPos)
    {
        int i = 0;

        if((iPos < 1) || (iPos > iCount))
        {
            System.out.println("Invalid position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else
        {
            node temp = first;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            iCount--;
        }
    }
}