function CheckPerfect(No)
{
    let i = 0
    let sum = 0

    for(i= 1; i <= No/2; i++)
    {
        if(No % i == 0)
        {
            sum = sum + i
        }
    }

    return(No == sum)
}

function main()
{
    let bRet = false


    bRet = CheckPerfect(28)

    if(bRet == true)               
    {
        console.log("it is perfect number")
    }
    else
    {
        console.log("it is not a perfect number")

    }
}

main();