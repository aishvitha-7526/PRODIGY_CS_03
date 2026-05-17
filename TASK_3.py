
import re

password = input("Enter Password: ")

score = 0

# Check length
if len(password) >= 8:
    score += 1

# Check uppercase letter
if re.search(r"[A-Z]", password):
    score += 1

# Check lowercase letter
if re.search(r"[a-z]", password):
    score += 1

# Check number
if re.search(r"[0-9]", password):
    score += 1

# Check special character
if re.search(r"[@#$%^&+=!]", password):
    score += 1

# Display strength
if score == 5:
    print("Strong Password")
elif score >= 3:
    print("Medium Password")
else:
    print("Weak Password")
