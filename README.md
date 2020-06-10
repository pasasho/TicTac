# TicTac
A Tic Tac Toe mobile app.

In activity_main there a single element - a button.
Main activity gives a function to the activity_main button, which when pressed, sends the user to the game (activity_welcome;Welcome activity).

In activity_welcome a Relative layout is used to create a field on top of the screen with Player1 (cross) and Player2 (circle) scores,
and a button to reset the game. Below it a Linear layout is used to create the 3 by 3 grid for the Tic Tac Toe with every field (or box) being
a button.

In Welcome, firstly the points, turns and views are initialized. 
The onClick function checks if the win condition is met. If it isn't met and all the squares are filled
then a draw is declared.
CheckForWin method constantly checks the field to see if there is a combination of 3 diagonal or 3 in a row squares or circles are present, and if so, then there is a winner.
Player1Wins and player2Wins check if the player with the cross or circle has won, and if so, then a point is given to their total points.
