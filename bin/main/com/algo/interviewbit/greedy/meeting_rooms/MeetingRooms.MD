# Meeting Rooms

Given a list of intervals: `[s, e]` for meetings, find the *least number*
of meeting rooms required.

Constraints
==========
* <code> 1 <= N <= 10<sup>5</sup> </code>
* <code> 1 <= A[i][0] <= A[i][1] <= 10<sup>9</sup> </code>

Examples
--------

### Example 1
**Input**: `[[5, 10], [15, 20], [0, 30]]`  <br />
**Output**: `2`  <br />
**Explanation**:  <br />
* [0, 30] and [5, 10] take place simultaneously.
* Same for [0, 30] and [15, 20]