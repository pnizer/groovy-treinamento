def ehPar = { 
  println "${it} ehPar?"
  it % 2 == 0 
}

def ehMaior = { valor ->
  { x -> 
    println "${x} eh maior do que ${valor}?"
     x > valor
   }
}

def ehMaiorDoQue20 = ehMaior(20)

/*def result = (1..100)
   .findAll(ehPar)
   .findAll(ehMaiorDoQue20)

println(result[0..4])*/

result = (1..100).stream()
     .filter(ehPar)
   .filter(ehMaiorDoQue20)
   .limit(5)
   .collect()

println result




