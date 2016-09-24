

@TailRecursive
def sizeOfList(list, counter = 0) {
    if (list.size() == 0) {
        counter
    } else {
       sizeOfList(list.tail(), counter + 1)
    }
}


/*def sizeOfList    
sizeOfList = {list, counter = 0 ->
    if (list.size() == 0) {
        counter
    } else {
       sizeOfList.trampoline(list.tail(), counter + 1)
    }
}.trampoline()*/

println(sizeOfList(1..10000))
