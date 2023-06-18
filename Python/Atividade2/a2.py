# Atividade de listas

inscricao = input(str("Digite aqui o número do cadastro da inscrição:"))
lista_inscricao = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
print(lista_inscricao)

lista_nome = []

for i in range(12):
    nome = input(str("Digite aqui o nome:"))
    lista_nome.append(nome)
print(lista_nome)

lista_sexo = []

for i in range(12):
    sexo = input(
        str("Digite aqui o sexo (F pra feminino e M para masculino):")). upper()
    lista_sexo.append(sexo)
print(lista_sexo)

lista_idade = []

for i in range(12):
    idade = input(int("Digite aqui a idade:"))
    lista_idade.append(idade)
print(lista_idade)

somanumeros = sum(lista_idade)
media_idades = lista_idade / 12
