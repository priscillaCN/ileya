customer_name = input("What is the customer's name?:  ")
cashier_name = input("What is your name?:  ")
		
items = []
quantity_per_item = []
price_per_item = []
		
count = 0
			
while True: 

    items.append(input(f"Enter item {count + 1}:  "))
    price_per_item.append(float(input(f"Enter price {count + 1}:  ")))

    quantity_per_item.append(int(input(f"Enter quantity {count + 1}:  ")))
			
    print("Add more items? (yes/no)")
    answer = input()
				
    if answer.lower() != "yes" and answer.lower() != "no": 
					
        print("Invalid answer")				
        print("Add more items? (yes/no)")

        answer = input() 

    count += 1   
						
    if answer.lower() == "no": 
        break
		
sub_total = 0
		
for index in range (count): 
			
    sub_total += (price_per_item[index] * quantity_per_item[index])	
			
discount = sub_total * 0.10
vat = sub_total * 0.075
bill_total = sub_total - (discount + vat)

print("Bill Total =", bill_total)

print("How much did the customer pay?")
amount_paid = float(input())
		
balance = bill_total - amount_paid		
		
print("\nSEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS")
print("TEL: 03293828343")
print("Date: 02-Jun-26 1:57:31 pm")
print("Cashier:", cashier_name)
print("Customer Name:", customer_name)
print("\n=================================================================\n")
print("	ITEM		QTY		PRICE		TOTAL(NGN)")
print("\n----------------------------------------------------------------\n")
		
for index in range (count): 
			
    item_total =  price_per_item[index] * quantity_per_item[index]			
    print(f"{items[index]:>15} {quantity_per_item[index]:>15d} {price_per_item[index]:>15.2f} {item_total:>15.2f}")

				
print("\n\n---------------------------------------------------------------\n")
print(f"{"Sub Total: ":>40}{sub_total:>20.2f}")
print(f"{"Discount: ":>40}{discount:>20.2f}")
print(f"{"VAT @ 7.50%: ":>40}{vat:>20.2f}")
	
print("\n===============================================================\n")
print(f"{"Bill Total: ":>40}{bill_total:>20.2f}")
print(f"{"Amount Paid: ":>40}{amount_paid:>20.2f}")
print(f"{"Balance: ":>40}{balance:>20.2f}")
		
print("\n===============================================================\n")
print("\t\tTHANK YOU FOR YOUR PATRONAGE")
print("\n===============================================================\n")

