function CheckEven(No)
{
   return(No % 2 == 0)
}

function main()
{
    let Value = 11
    let bRet = false

    bRet = CheckEven(Value)

    if(bRet)
    {
        console.log(`${Value} is even number`)
    }
    else
    {
        console.log(`${Value} is odd number`)
    }
}

main();