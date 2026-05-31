const prompt = require("prompt-sync")();

let customerName = String(prompt("What is the customer's name?:  "));
let cashierName = String(prompt("What is your name?:  "));
		
const items = [];
const quantityPerItem = [];
const pricePerItem = [];
		
let count = 0;
			
while (true) {

    console.log("Enter item " + (count + 1));
    items[count] = String(prompt(""));
			
    console.log("Enter price");
    pricePerItem[count] = Number(prompt(""));
			
    console.log("Enter quantity");
    quantityPerItem[count] = Number(prompt(""));
			
    console.log("Add more items? (yes/no)");
    let answer = String(prompt(""));
				
    if(answer.toLowerCase() != "yes" && answer.toLowerCase() != "no") {
					
        console.log("Invalid answer");
						
        console.log("Add more items? (yes/no)");
        answer = String(prompt(""));
						
    }
						
    if (answer.toLowerCase() === "no") 
        break;
				
    count++;
						
}
		
let subTotal = 0;
		
for(let index = 0; index <= count; index++) {
			
subTotal += (pricePerItem[index] * quantityPerItem[index]);	
			
}

let discount = subTotal * 0.10;
let vat = subTotal * 0.075;
let billTotal = subTotal - (discount + vat);

console.log("Bill Total = " + billTotal);

console.log("How much did the customer pay?");
let amountPaid = Number(prompt(""));;
		
let balance = billTotal - amountPaid;		
		
console.log("\nSEMICOLON STORES");
console.log("MAIN BRANCH");
console.log("LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS");
console.log("TEL: 03293828343");
console.log("Date: 02-Jun-26 1:57:31 pm");
console.log("Cashier: " + cashierName);
console.log("Customer Name: " + customerName);
console.log("\n=================================================================\n");
console.log("	ITEM		QTY		PRICE		TOTAL(NGN)");
console.log("\n----------------------------------------------------------------\n");
		
for(let index = 0; index <= count; index++) {
			
    let itemTotal =  pricePerItem[index] * quantityPerItem[index];

    const item  = items[index].padEnd(15);
    const quantity = String(quantityPerItem[index]).padStart(15);
    const price = String(pricePerItem[index].toFixed(2)).padStart(15);
    const total = String(itemTotal.toFixed(2)).padStart(15);
			
    console.log(`${item} ${quantity} ${price} ${total}`);
			
}
		
console.log("\n\n---------------------------------------------------------------\n");
console.log("Sub Total: ".padStart(40) + subTotal.toFixed(2).padStart(20));
console.log("Discount: ".padStart(40) + discount.toFixed(2).padStart(20));
console.log("VAT @ 7.50%: ".padStart(40) + vat.toFixed(2).padStart(20));
	
console.log("\n===============================================================\n");
console.log("Bill Total: ".padStart(40) + billTotal.toFixed(2).padStart(20));
console.log("Amount Paid: ".padStart(40) + amountPaid.toFixed(2).padStart(20));
console.log("Balance: ".padStart(40) + balance.toFixed(2).padStart(20));
		
console.log("\n===============================================================\n");
console.log("\t\tTHANK YOU FOR YOUR PATRONAGE");
console.log("\n===============================================================\n");

