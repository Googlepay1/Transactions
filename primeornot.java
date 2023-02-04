#This is edited on Github
#This is python codes
#This is example of existing string
#Here we use "isnumeric" before if condition because we retriew only digits from the string

str= "I am 25 years old"
b =" "
for i in str:
    if i.isnumeric():
       b+=i
print(b)

#Here in this case we are taking input from user
str= input("Enter the string/line :")
b =" "
for i in str:
    if i.isnumeric():
       b+=i
print(b)

