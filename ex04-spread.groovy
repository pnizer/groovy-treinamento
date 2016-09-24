def lista = ['java', 'groovy', 'grails']

// imperativo
/*def tamanho = []
for (def elemento in lista) {
    tamanho << elemento.size()
}*/

// declarativa
def tamanho = lista*.size()

println tamanho
