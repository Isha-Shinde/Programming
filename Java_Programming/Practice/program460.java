class program460
{
    public static void main(String A[])
    {
        DoublyCL dobj = new DoublyCL();
        int iRet = 0;

        dobj.InsertFirst(101);
        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("number of nodes are :"+iRet);
        
        dobj.InsertLast(111);
        dobj.InsertLast(121);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("number of nodes are :"+iRet);

        
        dobj.DeleteFirst();

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("number of nodes are :"+iRet);
        
        dobj.DeleteLast();

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("number of nodes are :"+iRet);
        
    }
}

class node
{
    public int data;
    public node next;
    public node prev;

    node(int no)
    {
        this.data = no;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCL
{
    private node first;
    private node last;
    private int iCount;

    public DoublyCL() 
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        if(first == null || last == null)
        {
            return;
        }

        do
        {
            System.out.print("| "+temp.data+" | <=> ");
            temp = temp.next;
        }while(last.next != temp);
        
        System.out.println(" ");
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertFirst(int ino)
    {
        node newn = new node(ino);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;
            first = newn;
        }
        last.next = first;
        first.prev = last;
        
        iCount++;
    }

    public void InsertLast(int ino)
    {
        node newn = new node(ino);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            newn.prev = last;
            last = newn;
        }
        last.next = first;
        first.prev = last;
        
        iCount++;
    }

    public void InsertAtPos(int ino,int iPos)
    {
        
    }

    public void DeleteFirst()
    {
        if(first == null && last == null)
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
        first.prev = last;
        
        iCount--;
    }
    
    public void DeleteLast()
    {
        if(first == null && last == null)
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
            last = last.prev;
        }
        
        last.next = first;
        first.prev = last;
        
        iCount--;
    }
    
    public void DeleteAtPos(int iPos)
    {

    }
}