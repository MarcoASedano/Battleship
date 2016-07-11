# Battleship
A two person turned based game where each player tries to sink the opposing player's battleships. First to sink all of the battleships wins.

#build.xml
Ant file that compiles, runs, and cleans the project files
	-ant clean
		Deletes the build directory, including all generated .class files
	-ant compile
		Compiles all the .java files under the src directory, and creates a new build/classes
		directory to store them in
	-ant run
		runs the ant compile task and runs the BattleshipGame file

#src
Directory where all the .java src files will be stored

#build
Directory where all the compiled class files will be stored
