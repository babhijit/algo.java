# Distribute Candy

`N` kids stand in a line, each having an integer rating. 
We distribute candies as per the following rules:
* Each kid gets at least 1 candy.
* Kids with higher ratings than their neighbours get more candies.

*Find the minimum candies required.*

Constraints
===========
* <code> 1 <= N <= 10<sup>5</sup> </code>

Examples
--------


### Example 1
**Input**: `rating = [1, 3, 5, 1]` <br />
**Output**: 7 <br />
**Explanation**: <br />
Candies: `[1, 2, 3, 1]`

### Example 2
**Input**: `rating = [1, 2, 7, 4, 3, 3, 1]` <br />
**Output**: 12 <br />
**Explanation**: <br />
Candies:
* `rating[1] > rating[0] => candy[0] = 1`
* `rating[6] < rating[5] => candy[6] = 1`
* `rating[5] > rating[6] => candy[5] = 2`
* `rating[4] == rating[5] && rating[4] < rating[3] => candy[4] = 1`
* `rating[3] > rating[4] && rating[3] < rating[2] => candy[3] = 2`
* `rating[1] > rating[0] && rating[1] < rating[2] => candy[1] = 2` 
* `rating[1] < rating[2] > rating[3] => candy[2] = 3`
