# Sistema de compra de ingressos de cinema com opção de desconto e combos.

registro = parada = valor_desconto = valor_ingresso = sem_desconto = valor_i_desconto = 0
pessoas1 = pessoas2 = pessoas3 = pessoas4 = cd_cinquenta = sd_cinquenta = 0
sem_o_desconto_vinteecinco1 = sem_o_desconto_vinteecinco2 = 0
com_o_desconto_vinteecinco1 = com_o_desconto_vinteecinco2 = 0
sem_o_desconto_cinquenta1 = sem_o_desconto_cinquenta2 = 0
com_0_desconto_cinquenta1 = com_o_desconto_cinquenta2 = 0
sem_o_desconto_setentaecinco1 = sem_o_desconto_setentaecinco2 = 0
com_o_desconto_secentaecinco1 = com_o_desconto_setentaecinco2 = 0
sem_o_desconto_cem = com_o_desconto_cem = cliente_combo = 0
sad1 = cad1 = sad2 = cad2 = sad3 = cad3 = cad4 = sad4 = 0

lista_nome = []
lista_idade = []
lista_ingresso = []
l_zeroacinco = []
l_seisadoze = []
l_trezeavinte = []
l_secenta = []
l_valornormal = []
l_nomesecenta = []

vd_cem = 1

desconto_cem = []

while registro != -1:
    nome = str(input("Digite aqui o nome do cliente:"))
    lista_nome.append(nome)
    idade = int(input("Digite aqui a idade do cliente:"))
    lista_idade.append(idade)
    if 0 <= idade <= 5:
        valor_desconto = 20 * 0.1
        valor_i_desconto = 20 - valor_desconto
        l_zeroacinco.append(valor_i_desconto)
        pessoas1 += 1
    elif 6 <= idade <= 12:
        valor_desconto = 20 * 0.08
        valor_i_desconto = 20 - valor_desconto
        l_seisadoze.append(valor_i_desconto)
        pessoas2 += 1
    elif 13 <= idade <= 25:
        valor_desconto = 20 * 0.05
        valor_i_desconto = 20 - valor_desconto
        l_trezeavinte.append(valor_i_desconto)
        pessoas3 += 1
    elif idade > 60:
        valor_desconto = 20 * 0.15
        valor_i_desconto = 20 - valor_desconto
        l_secenta.append(valor_i_desconto)
        l_nomesecenta.append(nome)
        pessoas4 += 1
    else:
        valor_ingresso = valor_ingresso + 20
        l_valornormal.append(valor_ingresso)
        sem_desconto += 1
    combo = int(
        input("Digite aqui -1 se o cliente comprou um combo e 0 caso não:"))
    if combo == -1:
        ingresso = int(
            input("Digite aqui a quantidade de ingressos do combo (além do do cliente):"))
        if ingresso == 1:
            if 26 <= idade <= 59:
                sem_o_desconto_vinteecinco1 = 20 * 0.25
                sem_o_desconto_vinteecinco2 = 20 - sem_o_desconto_vinteecinco1
                sad1 += 1
            else:
                com_o_desconto_vinteecinco1 = valor_i_desconto * 0.25
                com_o_desconto_vinteecinco2 = valor_i_desconto - com_o_desconto_vinteecinco1
                cad1 += 1
        elif ingresso == 2:
            if 26 <= idade <= 59:
                sem_o_desconto_cinquenta1 = 20 * 0.50
                sem_o_desconto_cinquenta2 = 20 - sem_o_desconto_cinquenta1
                sad2 += 2
                sd_cinquenta += 1
            else:
                com_o_desconto_cinquenta1 = valor_i_desconto * 0.50
                com_o_desconto_cinquenta2 = valor_i_desconto - com_o_desconto_cinquenta1
                cad2 += 2
                cd_cinquenta += 1
        elif ingresso == 3:
            if 26 <= idade <= 59:
                sem_o_desconto_setentaecinco1 = 20 * 0.75
                sem_o_desconto_setentaecinco2 = 20 - sem_o_desconto_setentaecinco1
                sad3 += 3
            else:
                com_o_desconto_setentaecinco1 = valor_i_desconto * 0.75
                com_o_desconto_sententaecinco2 = valor_i_desconto - com_o_desconto_setentaecinco1
                cad3 += 3
        elif ingresso >= 4:
            if 26 <= idade <= 59:
                sem_o_desconto_cem = 20 - 20
                desconto_cem.append(nome)
                sad4 += 4
            else:
                com_o_desconto_cem = vd_cem - 1
                desconto_cem.append(nome)
                cad4 += 4
        while parada == 0:
            nome2 = str(
                input("Digite aqui o nome da pessoa que está no combo:"))
            idade2 = int(
                input("Digite aqui a idade da pessoa que está no combo:"))
            parada = int(input("Deseja parar de colocar as informações das pessoas do combo? (Digite -1 se sim e 0 se "
                               "não)"))
            if parada == -1:
                break
    elif combo == 0:
        break
    else:
        print("Digito inválido")
    registro = int(
        input("Deseja continuar o programa? (Digite 0 para sim e -1 caso não)"))
    if registro == -1:
        break

q_ingressosad = cad1 + sad1 + cad2 + sad2 + cad3 + sad3 + cad4 + sad4

totalc = len(l_zeroacinco) + len(l_seisadoze) + \
    len(l_trezeavinte) + len(l_secenta)
totalc2 = totalc + len(l_valornormal) + q_ingressosad

soma = sd_cinquenta + cd_cinquenta
percentual = soma * 100
percentual2 = percentual / totalc2

soma2 = sem_o_desconto_vinteecinco2 + com_o_desconto_vinteecinco2
soma3 = sem_o_desconto_cinquenta2 + com_o_desconto_cinquenta2
soma4 = sem_o_desconto_setentaecinco2 + com_o_desconto_setentaecinco2
soma5 = sem_o_desconto_cem + com_o_desconto_cem
total = soma2 + soma3 + soma4 + soma5

media = total / q_ingressosad

print("A relação de clientes com 100% de desconto combo no seu ingresso foi: ", desconto_cem)
print("A quantidade de ingressos adicionais que foram comprados foi de: ", q_ingressosad)
print("O percentual de clientes que tiveram desconto combo de 50% foi de: ", percentual2)
print("A média paga por clientes com combo foi de: ", media)
