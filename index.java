def quebraHex(num):
	listahex = []
	for i in num:
		if i == "A" or i == "a":
			listahex.append(10)
		if i == "B" or i == "b":
			listahex.append(11)
		if i == "C" or i == "c":
			listahex.append(12)
		if i == "D" or i == "d":
			listahex.append(13)
		if i == "E" or i == "e":
			listahex.append(14)
		if i == "F" or i == "f":
			listahex.append(15)
		if i == "0":
			listahex.append(0)
		if i == "1":
			listahex.append(1)
		if i == "2":
			listahex.append(2)
		if i == "3":
			listahex.append(3)
		if i == "4":
			listahex.append(4)
		if i == "5":
			listahex.append(5)	
		if i == "6":
			listahex.append(6)
		if i == "7":
			listahex.append(7)
		if i == "8":
			listahex.append(8)
		if i == "9":
			listahex.append(9)
		
	listahex = listahex[::-1]	
	return listahex

def hexToDec(num):
	result = 0
	potencia = 0
	listahex = quebraHex(num)
	
	for i in listahex:
		result += i * 16 ** potencia
		potencia += 1
	
	return result

def main(args):
	num = input("Diga um numero hexadecimal:")

	print(num,"=",hexToDec(num))
	
	return 0
	
if __name__ == '__main__':
	import sys
	sys.exit(main(sys.argv))
