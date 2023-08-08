notas100 = notas50 = notas20 = notas10 = notas5 = notas2 = notas1 = 0
d100 = d50 = d20 = d10 = d5 = d2 = d1 = 0
n = int(input())
print(n)

while 0 < n < 1000000:
    if n >= 100:
        d100 = n - 100
        n = d100
        notas100 += 1
    elif 100 > n >= 50:
        d100 = n - 50
        n = d100
        notas50 += 1
    elif 50 > n >= 20:
        d100 = n - 20
        n = d100
        notas20 += 1
    elif 20 > n >= 10:
        d100 = n - 10
        n = d100
        notas10 += 1
    elif 10 > n >= 5:
        d100 = n - 5
        n = d100
        notas5 += 1
    elif 5 > n >= 2:
        d100 = n - 2
        n = d100
        notas2 += 1
    elif 2 > n == 1:
        d100 = n - 1
        n = d100
        notas1 += 1
    else:
        break

print(f"{notas100} nota(s) de  R$ 100,00 \n {notas50} nota(s) de R$ 50, 00 \n {notas20} nota(s) de R$ 20,00 \n {notas10} nota(s) de R$ 10,00 \n {notas5} nota(s) de R$ 5,00 \n {notas2} nota(s) de R$ 2,00 \n {notas1} nota(s) de R$ 1,00 \n")
