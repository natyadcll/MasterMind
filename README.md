# MasterMind
Guess the number, as many times you can guess in a row. By VYNN

Team Member #1: Nitya Desai
Email: nitya02@my.yorku.ca
Section: P
Lab: 02

Team Member #2: Nataly De Castro
Email: nadcll06@my.yorku.ca
Section P
Lab: 01

                                                                    Project Title: MasterMind

This application will consist of a game in which the user can guess a number between 1 and X (the user can choose the number X, 10 or larger. If X = 10 it means that the application will randomly generate a number between 1 and 10). This number will be randomly picked by the computer. The computer will also count the number of times the user guessed each number right in a row and display the results as the game continues. The user will be able to add their username at first so it can be displayed with their scores later in the game. When the user guesses a wrong number, the scoreboard will reset. The game ends when an “END GAME” button is clicked. Highest score will be shown.

There will also be a Bet Mode. The game will follow the same as the classic mode; however, in this mode, the user will be able to bet money. The user will start with an imaginary $100. They will choose any amount from the money they have left to bet against the computer. In the case they guess the number, the user will win that amount. In the case they do not guess  the number, the user will lose the amount of money they decided to bet. The game can end in 2 ways; there will always be a button to end the game that when clicked the game will end and the user can leave with the amount of money they were last with. On the other hand, the game will automatically end when the user loses all the money.

                                                FUNCTIONAL REQUIREMENTS:

- The user will be able to write their username in a textbox that is between 3 and 10 characters in length.
- The username is not case sensitive and can contain any type of characters.
- There will be a scoreboard to keep track of continuous right guesses.
- Highest score will be saved on java using universal variables.
- The game ends when an “END GAME” button is clicked
- Validation error messages that should appear if the guess is not a number or empty.
- Validation error messages that should appear if the amount of bet is missing or invalid.
- In bet mode, the user will start with an imaginary $100.
- There will be a wallet scoreboard to keep track of the money the user has.
  - The user will choose any amount from the money they have left to bet against the computer.
  - Amount of money that was beted will double if guessed right and will be lost if guessed wrong.
  - The game can end with an “END GAME” button or when the user loses all their money.    
- Error messages will pop up on the screen as alerts.
- The design of the interface will be made on wireframes.
- Final message with a congratulation if the user wins.
- FInal message with encouragement if the user loses.



                            IMPLEMENTATION
● There are basically 2 modes in our app. (i) Classic mode
(ii)Bet Mode
● We have implemented most of the Classic mode stuff in our project
1. CLASSIC MODE
● Made the user interface for the classic mode.
● First the app ask the user to type user name
● Then the user chooses if the user wants to play classic or bet mode.
● After selecting the classic mode. User will choose between which number
he/she wants to guess(there will be dropdown menu for(10, 20, 30 , 40,
50).
● A text box will appear in which the user will enter his or her guess.
● If the user selects between 0 to 10, he will get 2 chances to guess the
number.
● If the user selects between 0 to 20, he will get 4 chances to guess the
number.
● If the user selects between 0 to 30, he will get 6 chances to guess the
number.
● If the user selects between 0 to 10, he will get 8 chances to guess the
number.
● If the user selects between 0 to 10, he will get 10 chances to guess the
number.
● Then the computer will show the win (with the guesses he took) or loss
window with the main menu button and try again button.




