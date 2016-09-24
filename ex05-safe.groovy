//def usuario = null
//def usuario = [nome: 'Philippe', github: 'http://github.com/pnizer']
def usuario = [github: 'http://github.com/pnizer']

def tamanho = usuario?.nome?.size()

println tamanho?:'Sem tamanho'