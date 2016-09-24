def soma = (0..1000)
    .findAll { it % 2 == 0 }
    .inject { acc, valor -> acc + valor }
println soma

def ehPar = { it % 2 == 0 }
if ([1,3,5,7,9].any(ehPar)) {
    println "tem par na lista!"
}
