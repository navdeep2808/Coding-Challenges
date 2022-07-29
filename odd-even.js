/* Coding Challenge:

2. JavaScript:

Create a function that determines whether a number is Oddish or Evenish. A number is Oddish if the sum of all of its digits is odd, and a number is Evenish if the sum of all of its digits is even. If a number is Oddish, return "Oddish". Otherwise, return "Evenish".

For example, oddishOrEvenish(121) should return "Evenish", since 1 + 2 + 1 = 4. oddishOrEvenish(41) should return "Oddish", since 4 + 1 = 5.

Examples
<code>oddishOrEvenish(43) ➞ "Oddish"
// 4 + 3 = 7
// 7 % 2 = 1
oddishOrEvenish(373) ➞ "Oddish"
// 3 + 7 + 3 = 13
// 13 % 2 = 1
oddishOrEvenish(4433) ➞ "Evenish"
// 4 + 4 + 3 + 3 = 14
// 14 % 2 = 0
*/
<html lang="en">
<head>
   <title>Odd Even</title>
</head>
<body>
<script>
        function oddEven(n){
            var sum=0;
            while(n>0) {
                sum += n%10
                n=n/10

            }
            if(sum % 2 == 0 )
                return "Even"
            if(sum % 2 != 0 )
                return "Odd"

        }
        console.log(oddEven(29))
        console.log(oddEven(289))
        console.log(oddEven(546));


    </script>
    </body>
</html>
