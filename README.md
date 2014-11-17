#Traffic simulation - Axel Boström & Linnea Dahl
##Building/running the program
We chose to make use of terminal input instead of parameter files, which causes our program to be built by a series of questions when run. These questions determine the likelyhood of a car spawning at a given time, how long the different lanes are aswell as how long the period and greentimes are. Depending on which numbers are used at the beginning, the statistics which are printed out when the program has finished executing will be adjusted accordingly. The program is done executing either after a certain amout of time has passed or it is unable to add additional cars into the system. Certain safeguards have been added to eliminate faulty input, i.e. anything other than positive intergers. 

The program is run by writing _java simulation_ and following the instructions when they appear in the terminal prompt.

##Goals
During this project, we have completed the following goal with use of the code written:

A2, E11, I22, I23.

We have also completed the following goals with use of independetly written code, since they were irrelevant to the project:

B4, B5, H19.

##Possible expansions
If we were to expand on this project, we would make classes which inherited the attributes of the Car class, for example a Bus class or a Taxi class. We could also improve the statistics gathered, and perhaps implement a way to make use of parameter files, to reduce the programs startup time.
