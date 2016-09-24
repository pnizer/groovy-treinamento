def lista = ['java', 'groovy', 'grails']

def tamanho = lista.collect { it.size() }
println tamanho

def detalhes = lista.collect { 
    [nome: it, tamanho: it.size(), upper: it.toUpperCase()]
}
println detalhes
