def get_card_type (card_number): 

    card_type = ""
        
    if card_number[0] == "4": 
        card_type = "Visa Card"
    elif card_number[0] == "5":
        card_type = "MasterCard"
    elif card_number[0] == "6":
        card_type = "Discover Card"
    elif card_number[0] == "3" and card_number[1] == "7":
        card_type = "American Express Card"
    else:
        card_type = "invalid card type"

    return card_type
        

def double_every_second_digit (card_number): 

    count = 0
    sum = 0

    for index in range (len(card_number) - 1, 0): 

        count ++ 1

        if count % 2 == 0:
            sum += (card_number[index] * 2)
    
    return sum


def add_every_digit_in_odd_places (card_number): 

    count = 0
    sum = 0

    for index in range (len(card_number) - 1, 0):

        count += 1

        if count % 2 != 0:
            sum += card_number[index]
    
    return sum

   
def validate_card_number (card_number): 

    validity_status = ""

    sum_of_doubled_digits = double_every_second_digit (card_number)
    sum_of_digits_in_odd_places = add_every_digit_in_odd_places (card_number)

    sum = sum_of_doubled_digits + sum_of_digits_in_odd_places

    if sum % 10 == 0:
        validity_status = "Valid"
    else:
        validity_status = "Invalid"

    return validity_status

            
print("\nHello, kindly enter card number to verify")
card_number = input()

user_card_type = get_card_type (card_number)
user_card_validity_status = validate_card_number (card_number)

print("\n***************************************************\n")
print("**Credit Card Type: ", user_card_type)
print("\n**Credit Card Number: ", card_number)
print("\n**Credit Card Digit Length: ", len(card_number))
print("\n**Credit Card Validity Status: ", user_card_validity_status)
print("\n***************************************************\n")

