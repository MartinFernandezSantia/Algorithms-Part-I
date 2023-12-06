**Knuth method** Used in course introduction exercise "RandomWord"



---

*Page 189, Analysis of Algorithms*

Function of the input size to determine how long will a program take to run.

- N = Input size
- T(N) = Time based off the input size
- a = Incognita that we need to find based off real data

$$
T(N) = a * N^3
$$

Example: The time for running the program with input size 1000 was 0.198s, so in order to get *a*, we must solve the following equation:

$$
0.198s = a * 1000^3 --> a = 198 * 10^{-12}
$$

And so, replacing *a* in the first equation, we can get the aproximate time for any given *N*.

---

*Page 191-192*

**Mathematical models:** D. E. Knuth postulated that, in principle, it's possible to describe the running time of our programs by taking into consideration this two factors:

- The cost of executing each statement (property of the computer, the OS and the compiler).
- The frequency of execution of each statement (property of the program and the input).
  If we know both for all instructions in the program, we can multiply them together and sum for all instructions in the 
  program to get the running time.

**Tilde aproximations:** Frequency analyses of this sort can lead to complicated and lengthy mathematical expressions. For example, consider the count just considered of the number of times the if statement in *ThreeSum* is executed:

$N (N-1)(N-2)/6 = N^3/6 - N^2/2 + N/3$

For this kind of expressions, it's typical that the terms after the leading term are relatively small, so in order to ignore this insignificant terms, we use the *tilde notation (~)*.

| function              | tilde approxiamtion | order of growth |
| --------------------- | ------------------- | --------------- |
| $N^3/6 - N^2/2 + N/3$ | ~$N^3/6$            | $N^3$           |
| $N^2/2 - N/2$         | ~$N^2/2$            | $N^2$           |
| $lgN + 1$             | ~$lgN$              | $lgN$           |



<img title="" src="file:///C:/Users/marti/Escritorio/Programmer%20Stuff/Courses/Algorithms-Part-I/Img-Apuntes/Captura%20de%20pantalla%202023-11-29%20150928.png" alt="" style="zoom:67%;">    <img title="" src="file:///C:/Users/marti/Escritorio/Programmer%20Stuff/Courses/Algorithms-Part-I/Img-Apuntes/Captura%20de%20pantalla%202023-11-29%20151028.png" alt="" style="zoom:67%;" data-align="inline">


