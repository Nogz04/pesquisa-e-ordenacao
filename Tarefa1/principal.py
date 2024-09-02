from geradores import Util
from ordenacao import Ordenacao

import random

# listas inicilizadas vazias
lista_bolha = []
lista_insercao = []
lista_selecao = []
lista_sort = []

quantidade = 60000  # serão 60 mil alunos gerados.

tamanhoNome = random.randint(3, 4)  # fazendo com que o tamanho dos nomes mude a cada compilação do código.


# Gerando os nomes e idades.
Util.gerador_Nomes_Idade_para_Lista(lista_bolha, quantidade, tamanhoNome) # voce pode mudar o tamanho do nome colocando o numero que desejar aqui também
Util.gerador_Nomes_Idade_para_Lista(lista_selecao, quantidade, tamanhoNome)
Util.gerador_Nomes_Idade_para_Lista(lista_insercao, quantidade, tamanhoNome)
Util.gerador_Nomes_Idade_para_Lista(lista_sort, quantidade, tamanhoNome)

# ----------------------------------------------------- #

print("\n==== Lista bolha ORDENADA ====\n")
Ordenacao.metodoBolha(lista_bolha)
for aluno in lista_bolha:
    print(aluno)

# ----------------------------------------------------- #

# print("\n==== Lista seleção ORDENADA ====\n")
# Ordenacao.metodoSelecao(lista_selecao)
# for aluno in lista_selecao:
#     print(aluno)

# ----------------------------------------------------- #

# print("\n==== Lista inserção ORDENADA ====\n")
# Ordenacao.metodoInsercao(lista_insercao)
# for aluno in lista_insercao:
#     print(aluno)

# ----------------------------------------------------- #

# print("\n==== Lista sort ORDENADA ====\n")
# lista_sort = sorted(lista_sort)
# for aluno in lista_sort:
#     print(aluno)


# TIRAR OS COMENTÁRIOS para executar cada lista, deixei o método bolha sem " # ".
# caso queira testar a ordenação por chaves, recomendo mudar o tamanho do nome e a quantidade de nomes gerados para uma visão melhor da ordenação por chaves.
