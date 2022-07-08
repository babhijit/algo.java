# 1473. Paint House III

There is a row of `m` houses in a small city, each house must be painted
with one of the `n` colours (labeled from `1` to `n`), 
some houses have been painted last summer should not be painted again.

A neighbourhood is a maximal group of continuous houses that are painted with the same colour.
* For example, <code> houses = [1, 2, 2, 3, 3, 2, 1, 1] </code> 
  contains `5` neighbourhoods <code>[{1}, {2, 2}, {3, 3}, {2}, {1, 1}]</code>

Given an array `houses`, an `m x n` matrix `cost` and an integer `target` where:
* <code>houses[i]</code>: is the colour of the house `i` and `0` is the house not painted yet.
* <code>cost[i][j]</code>: is the cost of paint the house `i` with colour `j + 1`

_Return the minimum cost of painting all the remaining houses in such a way 
that there are exactly <code>target</code> neighbourhoods_. If this is not possible, then return `-1`.

Constraints:
------------
*   <code> m == houses.length == cost.length </code>
*   <code> n == cost[i].length </code>
*   <code> 1 <= m <= 100 </code>
*   <code> 1 <= n <= 20 </code>
*   <code> 1 <= target <= m </code>
*   <code> 0 <= houses[i] <= n </code>
*   <code> 1 <= cost[i][j] <= 10<sup>4</sup> </code>

Examples
--------

### Example 1:

**Input**: <code> houses = [0,0,0,0,0], 
                  cost = [[1,10],[10,1],[10,1],[1,10],[5,1]], 
                  m = 5, n = 2, 
                  target = 3 </code>  <br />
**Output**: <code> 9 </code>  <br />
**Explanation**: Paint houses of this way `[1,2,2,1,1]`                 <br />
This array contains target = *3 neighborhoods*, `[{1}, {2,2}, {1,1}]`.  <br />
Cost of paint all houses `(1 + 1 + 1 + 1 + 5) = 9`.                     <br />       

------------------------------------------------------

### Example 2:

**Input**: <code> houses = [0,2,1,2,0], 
                  cost = [[1,10],[10,1],[10,1],[1,10],[5,1]], 
                  m = 5, n = 2, 
                  target = 3 </code> <br />
**Output**: <code> 11 </code> <br />
**Explanation**: Some houses are already painted, Paint the houses of this way `[2,2,1,2,2]`    <br />
This array contains target = *3 neighborhoods*, `[{2,2}, {1}, {2,2}]`.                          <br />
Cost of paint the first and last house `(10 + 1) = 11`.                                         <br />
                                                      
------------------------------------------------------

### Example 3:

**Input**: <code> houses = [3,1,2,3], 
                  cost = [[1,1,1],[1,1,1],[1,1,1],[1,1,1]], 
                  m = 4, n = 3, 
                  target = 3 </code>    <br />
**Output**: <code> -1 </code>    <br />
**Explanation**: Houses are already painted with a total of 4 neighborhoods [{3},{1},{2},{3}] different of target = 3.
