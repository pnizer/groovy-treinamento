def cl = { 
    println "Olá" 
} 
cl()

//cl = { nome -> println "Olá, ${nome}!" }
cl = { nome = "Anônimo" -> println "Olá, ${nome}!" }
//cl = { println "Olá, ${it}!" }

cl('Philippe')
cl('Thiago')
cl()


def soma = {x, y -> x + y }
println soma(1, 3)

def parOuImpar = {
    if (it % 2 == 0) {
        "par"
    } else {
        "ímpar"
    }
}
println parOuImpar(3)



