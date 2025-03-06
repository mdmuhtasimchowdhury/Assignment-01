# Assignment-01

Time Complexity Problems

Problem a

given that, 

int i, j, k = 0;
for (i = n / 2; i <= n; i++) {
    for (j = 2; j <= n; j = j * 2) {
        k = k + n / 2;
    }
}

Here, 
we have 2 loops. 

Outer loop contains (i = n / 2; i <= n; i++)
Here, initial i = n/2 upto till n and the iteration is i++ so it increases gradually by 1.
For time complexity = no. of iterations required is (n - n/2) = n/2
Time complexity = O(n/2) = O(n) {any constant is ignored)


Now 2nd loop is (j = 2; j <= n; j = j * 2)
Here, j is 2 upto n. J increases by j*2 everytime so its exponential.
so its upto like m power times of 2 until n which is 2^m = n.
Now logarithmic, m = logn.
Time complexity = O(logn).

for k = k + n / 2
Here, its just equation which iterates every time for every loop so its not counted. 

Therefore, total Time complexity = O(n) * O(logn) = O(nlogn)




Problem b

Here,  if (x == 0 || x == 1) {
            return x; } 
It takes O(1) time complexity. 

int i = 1, result = 1; Here also O(1)

Now while(result <= x) 
here, result = i * i , so i^2 
it will run until i^2 > x
so i =  √x
so Time complexity for loop is O(√x)
Rest are all O(1) as all simple functions.




Now for problem of code

here basically get min and max height through Max and Min. and then multipication of both index till the highest maxwater is found inside the max area method through use of arralylist.

