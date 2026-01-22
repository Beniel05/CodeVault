import random

word_list = ["aardvark", "baboon", "camel"]

# TODO-1 - Randomly choose a word from the word_list and assign it to a variable called chosen_word. Then print it.

# TODO-2 - Ask the user to guess a letter and assign their answer to a variable called guess. Make guess lowercase.

# TODO-3 - Check if the letter the user guessed (guess) is one of the letters in the chosen_word. Print "Right" if it
#  is, "Wrong" if it's not.

chosen_word = random.choice(word_list)
print(chosen_word)
guess = input("Guess a letter: ").lower()
for i in range(len(chosen_word)):
    if guess == chosen_word[i]:
        print("RIGHT")
    else:
        print("WRONG")
    # print("_", end = " ")