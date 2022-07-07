# 97. Interleaving String

Given strings `s1`, `s2` and `s3`, find whether `s3` is formed by **interleaving** of `s1` and `s2`.

An **interleaving** of two strings `s` and `t` is a configuration where they are divided into **non-empty** substrings such that:
* <code> s = s<sub>1</sub> + s<sub>2</sub> + s<sub>3</sub> + ... +  s<sub>n</sub> </code>
* <code> t = t<sub>1</sub> + t<sub>2</sub> + t<sub>3</sub> + ... + t<sub>m</sub> </code>
* The **interleaving** is <code> s = s<sub>1</sub> + s<sub>2</sub> + s<sub>3</sub> + ... </code> or <code> t = t<sub>1</sub> + t<sub>2</sub> + t<sub>3</sub> + ... </code>

**Note:** `a + b` is the concatenation of strings `a` and `b`


Constraints:
------------

*  <code>  0 <= s1.length, s2.length <= 100 </code>
*  <code>  0 <= s3.length <= 200 </code>
*  `s1`, `s2`, and `s3` consist of lowercase English letters.

-------------------------------------------------------------------

Examples
--------

### Example 1

<img src="interleave.jpg" alt=""/>

**Input**: `s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"`  <br />
**Output**: `true`  <br />

***Note: DP problem states are visualised in index.jpeg***

### Example 2:

**Input**: `s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"`  <br />
**Output**: `false`  <br />

### Example 3:

**Input**: `s1 = "", s2 = "", s3 = ""`  <br />
**Output**: `true`  <br />
