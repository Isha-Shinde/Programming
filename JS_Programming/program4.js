let no = 11

{
    let x = 21 // Error
}

console.log(no)
console.log(x)

/*
    let is blocked-scoped
    the variable x exists on;y inside {}
    when you try to access x outside the block, js throws a reference error
*/