# Quiz in Terminal

## How to Compile

First, navigate to the directory where the files are stores.
To compile the program type : `kotlinc main.kt -include-runtime -d main.jar`
To execute the program: `java -jar main.jar`  

## How to add Question
All the questions and their answers are stored in questions.txt.
To work correctly, format like this:
'''
What is the capital of Montana?
a. Helana
b. Billings
c. Bozeman
d. Red Lodge
a

'''

Have the first line contain the question. Then the next four will be the answers. Be sure to include a, b, c, or d out in front. Then type the letter that is the correct answer. Then leave a blank line before typing the next question. After the last question, type end instead of a blank line.
'''
What is the capital of Montana?
a. Helana
b. Billings
c. Bozeman
d. Red Lodge
a

What color are my shoes?
a. Orange
b. Black
c. Blue
d. Green
b

How many tribes of Israel are there?
a. 23
b. 12
c. 10
d. 13
b
End
'''
