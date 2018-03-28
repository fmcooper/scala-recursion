default: 
	scalac -cp . -d . src/*.scala


runexamplefib1: default
	@scala -cp . -d . src.Recurse fib standard 6
	@scala -cp . -d . src.Recurse fib tail 6

runexamplefib2: default
	@scala -cp . -d . src.Recurse fib standard 39
	@scala -cp . -d . src.Recurse fib tail 39



runexamplefac1: default
	@scala -cp . -d . src.Recurse fac standard 5
	@scala -cp . -d . src.Recurse fac tail 5

runexamplefac2: default
	@scala -cp . -d . src.Recurse fac standard 12
	@scala -cp . -d . src.Recurse fac tail 12



runexamplesum1: default
	@scala -cp . -d . src.Recurse sum standard 10
	@scala -cp . -d . src.Recurse sum tail 10

runexamplesum2: default
	@scala -cp . -d . src.Recurse sum standard 300
	@scala -cp . -d . src.Recurse sum tail 300

runexamplesum3: default
	@scala -cp . -d . src.Recurse sum standard 100000
	@scala -cp . -d . src.Recurse sum tail 100000